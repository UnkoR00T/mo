package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
public class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n f13252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f13253b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f13254c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f13255d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f13256e = null;

    public e(n nVar) {
        this.f13252a = nVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(int i15, int i16) {
        int i17;
        if (this.f13253b == 1 && i15 >= (i17 = this.f13254c)) {
            int i18 = this.f13255d;
            if (i15 <= i17 + i18) {
                this.f13255d = i18 + i16;
                this.f13254c = Math.min(i15, i17);
                return;
            }
        }
        e();
        this.f13254c = i15;
        this.f13255d = i16;
        this.f13253b = 1;
    }

    @Override // androidx.recyclerview.widget.n
    public void b(int i15, int i16) {
        int i17;
        if (this.f13253b == 2 && (i17 = this.f13254c) >= i15 && i17 <= i15 + i16) {
            this.f13255d += i16;
            this.f13254c = i15;
        } else {
            e();
            this.f13254c = i15;
            this.f13255d = i16;
            this.f13253b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.n
    @SuppressLint({"UnknownNullness"})
    public void c(int i15, int i16, Object obj) {
        int i17;
        if (this.f13253b == 3) {
            int i18 = this.f13254c;
            int i19 = this.f13255d;
            if (i15 <= i18 + i19 && (i17 = i15 + i16) >= i18 && this.f13256e == obj) {
                this.f13254c = Math.min(i15, i18);
                this.f13255d = Math.max(i19 + i18, i17) - this.f13254c;
                return;
            }
        }
        e();
        this.f13254c = i15;
        this.f13255d = i16;
        this.f13256e = obj;
        this.f13253b = 3;
    }

    @Override // androidx.recyclerview.widget.n
    public void d(int i15, int i16) {
        e();
        this.f13252a.d(i15, i16);
    }

    public void e() {
        int i15 = this.f13253b;
        if (i15 == 0) {
            return;
        }
        if (i15 == 1) {
            this.f13252a.a(this.f13254c, this.f13255d);
        } else if (i15 == 2) {
            this.f13252a.b(this.f13254c, this.f13255d);
        } else if (i15 == 3) {
            this.f13252a.c(this.f13254c, this.f13255d, this.f13256e);
        }
        this.f13256e = null;
        this.f13253b = 0;
    }
}
