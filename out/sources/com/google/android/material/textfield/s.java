package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes4.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f35770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f35771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f35772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f35773d;

    s(r rVar) {
        this.f35770a = rVar.f35740a;
        this.f35771b = rVar;
        this.f35772c = rVar.getContext();
        this.f35773d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i15, int i16, int i17) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    boolean i(int i15) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, k6.p pVar) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z15) {
    }

    final void r() {
        this.f35771b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
