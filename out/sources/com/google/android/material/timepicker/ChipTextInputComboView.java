package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.m;
import com.google.android.material.internal.q;
import com.google.android.material.textfield.TextInputLayout;
import ri.h;

/* JADX INFO: loaded from: classes4.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chip f35832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f35833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EditText f35834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextWatcher f35835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f35836e;

    private class b extends m {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f35832a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f35832a;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    private void d() {
        this.f35834c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f35832a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z15) {
        this.f35832a.setChecked(z15);
        this.f35834c.setVisibility(z15 ? 0 : 4);
        this.f35832a.setVisibility(z15 ? 8 : 0);
        if (isChecked()) {
            q.j(this.f35834c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f35832a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i15, Object obj) {
        this.f35832a.setTag(i15, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f35832a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f174028i, (ViewGroup) this, false);
        this.f35832a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f174029j, (ViewGroup) this, false);
        this.f35833b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f35834c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f35835d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f35836e = (TextView) findViewById(ri.f.f174004n);
        editText.setId(View.generateViewId());
        this.f35836e.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
