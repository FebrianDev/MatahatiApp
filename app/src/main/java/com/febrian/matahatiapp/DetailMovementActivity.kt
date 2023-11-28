package com.febrian.matahatiapp

import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.febrian.matahatiapp.databinding.ActivityDetailMovementBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailMovementActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMovementBinding

    private lateinit var player: androidx.media3.exoplayer.ExoPlayer

    private val viewModel: MovementViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getAllCategory()

        viewModel.getItem.observe(this) {
            it.onSuccess {
                Log.d("Data2", it.toString())
            }.onFailure {
                Log.d("Data2", it.message.toString())
            }
        }

        val uri: Uri =
            Uri.parse("https://storage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4")

        val exoPlayerView = binding.idExoPlayerVIew
        player = androidx.media3.exoplayer.ExoPlayer.Builder(applicationContext).build()
        exoPlayerView.player = player
        val mediaItem = androidx.media3.common.MediaItem.fromUri(uri)
        player.setMediaItem(mediaItem)
        //player.prepare()
        player.playWhenReady = true
       // player.play()

        /*  exoPlayerView.setOnClickListener {
              val mediaItem = androidx.media3.common.MediaItem.fromUri(uri)
              player.setMediaItem(mediaItem)
              player.prepare()
              player.play()
          }*/


//        player.addListener(object:Player.Listener, com.google.android.exoplayer2.Player.Listener {
//
//        })
    }

    override fun onPause() {
        super.onPause()
        pausePlayer()
    }

    override fun onResume() {
        super.onResume()
        startPlayer()
    }

    private fun pausePlayer() {
        player.playWhenReady = false
        player.getPlaybackState()
    }

    private fun startPlayer() {
        player.playWhenReady = true
        player.getPlaybackState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        startPlayer()
    }
}