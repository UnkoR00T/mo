package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
class y extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f35820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f35821g;

    y(r rVar, int i15) {
        super(rVar);
        this.f35819e = ri.e.f173980a;
        this.f35821g = new View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.v(this.f35818a, view);
            }
        };
        if (i15 != 0) {
            this.f35819e = i15;
        }
    }

    public static /* synthetic */ void v(y yVar, View view) {
        EditText editText = yVar.f35820f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (yVar.w()) {
            yVar.f35820f.setTransformationMethod(null);
        } else {
            yVar.f35820f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            yVar.f35820f.setSelection(selectionEnd);
        }
        yVar.r();
    }

    private boolean w() {
        EditText editText = this.f35820f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    void b(CharSequence charSequence, int i15, int i16, int i17) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return ri.j.C;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return this.f35819e;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f35821g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(EditText editText) {
        this.f35820f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f35820f)) {
            this.f35820f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f35820f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
