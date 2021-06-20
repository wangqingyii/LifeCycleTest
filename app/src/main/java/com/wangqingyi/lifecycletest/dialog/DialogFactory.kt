package com.wangqingyi.lifecycletest.dialog

import android.app.Dialog
import android.content.Context
import android.view.Window
import com.wangqingyi.lifecycletest.R
import com.wangqingyi.lifecycletest.databinding.CommonDialogConfirmBinding

class DialogFactory {
    companion object {

        /**
         * 创建一个通用确认对话框
         * @param context 上下文
         * @param title 标题
         * @param canceledOnTouchOutside  是否可点击外部区域取消 默认 true
         */
        inline fun createConfirmDialog(
            context: Context,
            title: String,
            canceledOnTouchOutside: Boolean = true,
        ): Dialog {
            val dialog = Dialog(context, R.style.common_transparent_dialog)
            val viewBinding = CommonDialogConfirmBinding.inflate(dialog.layoutInflater)
            // 标题内容
            viewBinding.mTitleTv.text = title
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            // 点击外部是否可取消
            dialog.setCanceledOnTouchOutside(canceledOnTouchOutside)
            // 设置自定义布局
            dialog.setContentView(viewBinding.root)
            return dialog
        }
    }
}