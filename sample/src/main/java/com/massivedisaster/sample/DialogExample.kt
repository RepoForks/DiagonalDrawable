/*
 * DiagonalDrawable - A Diagonal Drawable for backgrounds, etc..
 *
 * Copyright (c) 2018 DiagonalDrawable
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.massivedisaster.sample

import android.app.AlertDialog
import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.Window
import com.massivedisaster.drawable.DiagonalDrawable
import kotlinx.android.synthetic.main.dialog_example.*

class DialogExample(context: Context) : AlertDialog(context) {

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
    }

    override fun show() {
        super.show()
        setContentView(R.layout.dialog_example)

        frmRoot.background = DiagonalDrawable(ContextCompat.getColor(context, R.color.left),
                ContextCompat.getColor(context, R.color.right),
                DiagonalDrawable.Orientation.LEFT_RIGHT)
    }
}