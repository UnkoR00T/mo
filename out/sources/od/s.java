package od;

import android.graphics.Paint;
import fd.a0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s implements od.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nd.b f144781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<nd.b> f144782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.a f144783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nd.d f144784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nd.b f144785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f144786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f144787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f144788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f144789j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f144790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f144791b;

        static {
            int[] iArr = new int[c.values().length];
            f144791b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f144791b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f144791b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f144790a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f144790a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f144790a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap e() {
            int i15 = a.f144790a[ordinal()];
            if (i15 != 1) {
                return i15 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join e() {
            int i15 = a.f144791b[ordinal()];
            if (i15 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i15 == 2) {
                return Paint.Join.MITER;
            }
            if (i15 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, nd.b bVar, List<nd.b> list, nd.a aVar, nd.d dVar, nd.b bVar2, b bVar3, c cVar, float f15, boolean z15) {
        this.f144780a = str;
        this.f144781b = bVar;
        this.f144782c = list;
        this.f144783d = aVar;
        this.f144784e = dVar;
        this.f144785f = bVar2;
        this.f144786g = bVar3;
        this.f144787h = cVar;
        this.f144788i = f15;
        this.f144789j = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.t(a0Var, bVar, this);
    }

    public b b() {
        return this.f144786g;
    }

    public nd.a c() {
        return this.f144783d;
    }

    public nd.b d() {
        return this.f144781b;
    }

    public c e() {
        return this.f144787h;
    }

    public List<nd.b> f() {
        return this.f144782c;
    }

    public float g() {
        return this.f144788i;
    }

    public String h() {
        return this.f144780a;
    }

    public nd.d i() {
        return this.f144784e;
    }

    public nd.b j() {
        return this.f144785f;
    }

    public boolean k() {
        return this.f144789j;
    }
}
