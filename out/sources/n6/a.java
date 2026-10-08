package n6;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ColorDrawable f132326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f132327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f132328r;

    public a(int i15) {
        super(i15);
        this.f132326p = new ColorDrawable();
        this.f132328r = 0;
    }

    private void q(int i15) {
        if (this.f132328r != i15) {
            this.f132328r = i15;
            this.f132326p.setColor(i15);
            i(this.f132326p);
        }
    }

    @Override // n6.b
    void a(int i15) {
        if (this.f132327q) {
            return;
        }
        q(i15);
    }

    @Override // n6.b
    boolean g() {
        return true;
    }

    public void p(int i15) {
        this.f132327q = true;
        q(i15);
    }

    public a(int i15, int i16) {
        this(i15);
        p(i16);
    }
}
