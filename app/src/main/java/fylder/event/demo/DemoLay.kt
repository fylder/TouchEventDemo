package fylder.event.demo

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.RelativeLayout

/**
 * Created by fylder on 2017/7/28.
 */
class DemoLay : RelativeLayout {

    constructor(mContext: Context) : super(mContext)

    constructor(mContext: Context, mAttributeSet: AttributeSet) : super(mContext, mAttributeSet)

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {

            MotionEvent.ACTION_DOWN -> {
                Log.i("test", "lay onTouchEvent down")
            }
            MotionEvent.ACTION_MOVE -> {
//                    Log.i("test", "lay onTouchEvent move")
            }
            MotionEvent.ACTION_UP -> {
                Log.i("test", "lay onTouchEvent up")
            }
        }
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {

            MotionEvent.ACTION_DOWN -> {
                Log.i("test", "lay dispatchTouchEvent down")
            }
            MotionEvent.ACTION_MOVE -> {
//                    Log.i("test", "lay dispatchTouchEvent move")
            }
            MotionEvent.ACTION_UP -> {
                Log.i("test", "lay dispatchTouchEvent up")
            }
        }
        return super.dispatchTouchEvent(event)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {

            MotionEvent.ACTION_DOWN -> {
                Log.i("test", "lay onInterceptTouchEvent down")
            }
            MotionEvent.ACTION_MOVE -> {
//                    Log.i("test", "lay onInterceptTouchEvent move")
            }
            MotionEvent.ACTION_UP -> {
                Log.i("test", "lay onInterceptTouchEvent up")
            }
        }
        return super.onInterceptTouchEvent(ev)
    }
}