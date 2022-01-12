package uz.mufassal.showprogres

import android.app.ProgressDialog
import android.content.Context

object ShowProgress {

    fun visibleProgress(context : Context ,title : String ,timeout  : Int){

        var show = ProgressDialog(context)
        show.setMessage(title)
        show.show()

        android.os.Handler().postDelayed({
            show.dismiss()
        } , timeout.toLong())

    }

}