package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11372a;

    public Guideline(Context context) {
        super(context);
        this.f11372a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z15) {
        this.f11372a = z15;
    }

    public void setGuidelineBegin(int i15) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f11372a && bVar.f11314a == i15) {
            return;
        }
        bVar.f11314a = i15;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i15) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f11372a && bVar.f11316b == i15) {
            return;
        }
        bVar.f11316b = i15;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f15) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f11372a && bVar.f11318c == f15) {
            return;
        }
        bVar.f11318c = f15;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i15) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11372a = true;
        super.setVisibility(8);
    }
}
