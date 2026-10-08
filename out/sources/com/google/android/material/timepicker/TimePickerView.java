package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import ri.h;

/* JADX INFO: loaded from: classes4.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip C;
    private final Chip D;
    private final ClockHandView E;
    private final ClockFaceView F;
    private final MaterialButtonToggleGroup G;
    private final View.OnClickListener H;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.E(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.F(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f35868a;

        c(GestureDetector gestureDetector) {
            this.f35868a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f35868a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e E(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void G() {
        this.C.setTag(ri.f.H, 12);
        this.D.setTag(ri.f.H, 10);
        this.C.setOnClickListener(this.H);
        this.D.setOnClickListener(this.H);
        this.C.setAccessibilityClassName("android.view.View");
        this.D.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void H() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.C.setOnTouchListener(cVar);
        this.D.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i15) {
        super.onVisibilityChanged(view, i15);
        if (view == this && i15 == 0) {
            this.D.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.H = new a();
        LayoutInflater.from(context).inflate(h.f174030k, this);
        this.F = (ClockFaceView) findViewById(ri.f.f173999i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(ri.f.f174002l);
        this.G = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i16, boolean z15) {
                this.f35880a.getClass();
            }
        });
        this.C = (Chip) findViewById(ri.f.f174005o);
        this.D = (Chip) findViewById(ri.f.f174003m);
        this.E = (ClockHandView) findViewById(ri.f.f174000j);
        H();
        G();
    }
}
