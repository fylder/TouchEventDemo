package fylder.event.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_demo.*

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        init()
    }

    fun init() {
        demo_btn.setOnClickListener({ Log.d("test", "button OnClickListener") })
        demo_lay.setOnLongClickListener({
            Log.d("test", "demo_lay OnLongClickListener")
            true
        })
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {

            MotionEvent.ACTION_DOWN -> {
                Log.d("test", "activity dispatchTouchEvent down")
            }
            MotionEvent.ACTION_MOVE -> {
//                    Log.d("test", "activity dispatchTouchEvent move")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("test", "activity dispatchTouchEvent up")
            }
        }
        return super.dispatchTouchEvent(event)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {

            MotionEvent.ACTION_DOWN -> {
                Log.d("test", "activity onTouchEvent down")
            }
            MotionEvent.ACTION_MOVE -> {
//                    Log.d("test", "activity onTouchEvent move")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("test", "activity onTouchEvent up")
            }
        }
        return super.onTouchEvent(event)
    }
}
