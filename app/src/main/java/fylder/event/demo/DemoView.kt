package fylder.event.demo

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.TextView

/**
 * Created by fylder on 2017/7/28.
 */
class DemoView : TextView {

    constructor(mContext: Context) : super(mContext)

    constructor(mContext: Context, mAttributeSet: AttributeSet) : super(mContext, mAttributeSet)

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {

            MotionEvent.ACTION_DOWN -> {
                Log.w("test", "view onTouchEvent down")
            }
            MotionEvent.ACTION_MOVE -> {
//                    Log.w("test", "view onTouchEvent move")
            }
            MotionEvent.ACTION_UP -> {
                Log.w("test", "view onTouchEvent up")
            }
        }
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {

            MotionEvent.ACTION_DOWN -> {
                Log.w("test", "view dispatchTouchEvent down")
            }
            MotionEvent.ACTION_MOVE -> {
//                    Log.w("test", "view dispatchTouchEvent move")
            }
            MotionEvent.ACTION_UP -> {
                Log.w("test", "view dispatchTouchEvent up")
            }
        }
        return super.dispatchTouchEvent(event)
    }


}