package km;

import am.d;
import am.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.ui.RotationLayout;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f111384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f111385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RotationLayout f111386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f111387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f111388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f111390g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f111391h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f111392i;

    public b(Context context) {
        this.f111384a = context;
        this.f111392i = new a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(d.f7763a, (ViewGroup) null);
        this.f111385b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f111386c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(am.c.f7762a);
        this.f111387d = textView;
        this.f111388e = textView;
        h(1);
    }

    private static int a(int i15) {
        if (i15 == 3) {
            return -3407872;
        }
        if (i15 == 4) {
            return -16737844;
        }
        if (i15 == 5) {
            return -10053376;
        }
        if (i15 != 6) {
            return i15 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int b(int i15) {
        return (i15 == 3 || i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) ? e.f7765b : e.f7764a;
    }

    public Bitmap c() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f111385b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.f111385b.getMeasuredWidth();
        int measuredHeight = this.f111385b.getMeasuredHeight();
        this.f111385b.layout(0, 0, measuredWidth, measuredHeight);
        int i15 = this.f111389f;
        if (i15 == 1 || i15 == 3) {
            measuredHeight = this.f111385b.getMeasuredWidth();
            measuredWidth = this.f111385b.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i16 = this.f111389f;
        if (i16 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i16 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i16 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.f111385b.draw(canvas);
        return bitmapCreateBitmap;
    }

    public Bitmap d(CharSequence charSequence) {
        TextView textView = this.f111387d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return c();
    }

    public void e(Drawable drawable) {
        this.f111385b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.f111385b.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f111385b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void f(int i15) {
        this.f111392i.a(i15);
        e(this.f111392i);
    }

    public void g(View view) {
        this.f111386c.removeAllViews();
        this.f111386c.addView(view);
        this.f111388e = view;
        View viewFindViewById = this.f111386c.findViewById(am.c.f7762a);
        this.f111387d = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
    }

    public void h(int i15) {
        f(a(i15));
        j(this.f111384a, b(i15));
    }

    public void i(int i15) {
        j(this.f111384a, i15);
    }

    public void j(Context context, int i15) {
        TextView textView = this.f111387d;
        if (textView != null) {
            textView.setTextAppearance(context, i15);
        }
    }
}
