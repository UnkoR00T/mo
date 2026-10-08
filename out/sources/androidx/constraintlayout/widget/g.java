package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public class g extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11529c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f11528b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f11528b.getLayoutParams();
        bVar2.f11357v0.m1(0);
        n5.e.b bVarA = bVar.f11357v0.A();
        n5.e.b bVar3 = n5.e.b.FIXED;
        if (bVarA != bVar3) {
            bVar.f11357v0.n1(bVar2.f11357v0.Y());
        }
        if (bVar.f11357v0.V() != bVar3) {
            bVar.f11357v0.O0(bVar2.f11357v0.x());
        }
        bVar2.f11357v0.m1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f11527a == -1 && !isInEditMode()) {
            setVisibility(this.f11529c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f11527a);
        this.f11528b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f11333j0 = true;
            this.f11528b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f11528b;
    }

    public int getEmptyVisibility() {
        return this.f11529c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(GF2Field.MASK, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i15) {
        View viewFindViewById;
        if (this.f11527a == i15) {
            return;
        }
        View view = this.f11528b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f11528b.getLayoutParams()).f11333j0 = false;
            this.f11528b = null;
        }
        this.f11527a = i15;
        if (i15 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i15)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i15) {
        this.f11529c = i15;
    }
}
