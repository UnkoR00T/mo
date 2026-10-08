package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0012\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lu0/z0;", "T", "Lu0/f0;", "Lu0/z0$b;", "config", "<init>", "(Lu0/z0$b;)V", "Lu0/t;", "V", "Lu0/y2;", "converter", "Lu0/c4;", "g", "(Lu0/y2;)Lu0/c4;", "a", "Lu0/z0$b;", "f", "()Lu0/z0$b;", "b", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<T> config;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lu0/z0$a;", "T", "Lu0/y0;", "value", "Lu0/g0;", "easing", "Lu0/x;", "arcMode", "<init>", "(Ljava/lang/Object;Lu0/g0;ILfr/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "I", "d", "setArcMode-Rur9ykg$animation_core", "(I)V", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends y0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int arcMode;

        public /* synthetic */ a(Object obj, g0 g0Var, int i15, fr.k kVar) {
            this(obj, g0Var, i15);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getArcMode() {
            return this.arcMode;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return fr.t.c(aVar.b(), b()) && fr.t.c(aVar.getEasing(), getEasing()) && x.c(aVar.arcMode, this.arcMode);
        }

        public int hashCode() {
            T tB = b();
            return ((((tB != null ? tB.hashCode() : 0) * 31) + x.d(this.arcMode)) * 31) + getEasing().hashCode();
        }

        private a(T t15, g0 g0Var, int i15) {
            super(t15, g0Var, null);
            this.arcMode = i15;
        }

        public /* synthetic */ a(Object obj, g0 g0Var, int i15, int i16, fr.k kVar) {
            this(obj, (i16 & 2) != 0 ? i0.e() : g0Var, (i16 & 4) != 0 ? x.INSTANCE.a() : i15, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0096\u0004¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0087\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu0/z0$b;", "T", "Lu0/a1;", "Lu0/z0$a;", "<init>", "()V", "", "timeStamp", "f", "(Ljava/lang/Object;I)Lu0/z0$a;", "Lu0/g0;", "easing", "Loq/i0;", "g", "(Lu0/z0$a;Lu0/g0;)V", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> extends a1<T, a<T>> {
        public b() {
            super(null);
        }

        public a<T> f(T t15, int i15) {
            a<T> aVar = new a<>(t15, null, 0, 6, null);
            c().r(i15, aVar);
            return aVar;
        }

        @oq.a
        public final void g(a<T> aVar, g0 g0Var) {
            aVar.c(g0Var);
        }
    }

    public z0(b<T> bVar) {
        this.config = bVar;
    }

    public final b<T> f() {
        return this.config;
    }

    @Override // u0.j0, u0.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public <V extends t> c4<V> a(y2<T, V> converter) {
        long[] jArr;
        int[] iArr;
        r0.i0 i0Var = new r0.i0(this.config.c().get_size() + 2);
        r0.j0 j0Var = new r0.j0(this.config.c().get_size());
        r0.j0<a<T>> j0VarC = this.config.c();
        int[] iArr2 = j0VarC.keys;
        Object[] objArr = j0VarC.values;
        long[] jArr2 = j0VarC.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr2[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((255 & j15) < 128) {
                            int i19 = (i15 << 3) + i18;
                            int i25 = iArr2[i19];
                            a aVar = (a) objArr[i19];
                            i0Var.k(i25);
                            j0Var.r(i25, new VectorizedKeyframeSpecElementInfo(converter.a().b(aVar.b()), aVar.getEasing(), aVar.getArcMode(), null));
                        }
                        j15 >>= i16;
                        i18++;
                        i16 = i16;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    if (i17 != i16) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        }
        if (!this.config.c().a(0)) {
            i0Var.j(0, 0);
        }
        if (!this.config.c().a(this.config.getDurationMillis())) {
            i0Var.k(this.config.getDurationMillis());
        }
        i0Var.s();
        return new c4<>(i0Var, j0Var, this.config.getDurationMillis(), this.config.getDelayMillis(), i0.e(), x.INSTANCE.a(), null);
    }
}
