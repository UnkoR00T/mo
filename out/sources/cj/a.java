package cj;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dialog f27223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27226d;

    public a(Dialog dialog, Rect rect) {
        this.f27223a = dialog;
        this.f27224b = rect.left;
        this.f27225c = rect.top;
        this.f27226d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f27224b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f27225c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i15 = this.f27226d;
            motionEventObtain.setLocation((-i15) - 1, (-i15) - 1);
        }
        view.performClick();
        return this.f27223a.onTouchEvent(motionEventObtain);
    }
}
