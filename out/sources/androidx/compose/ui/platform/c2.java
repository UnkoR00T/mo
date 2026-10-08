package androidx.compose.ui.platform;

import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\r\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u0003R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/c2;", "Landroidx/lifecycle/t0;", "<init>", "()V", "", "viewId", "Landroidx/compose/ui/platform/c2$b;", "Z8", "(I)Landroidx/compose/ui/platform/c2$b;", "Loq/i0;", "Y8", "Lr0/j0;", "Lr0/q0;", "b", "Lr0/j0;", "scopes", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 extends androidx.p016lifecycle.t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r0.j0<r0.q0<b>> scopes = r0.r.c();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/c2$a;", "", "Lkotlin/Function0;", "Loq/i0;", "action", "Lm2/g;", "a", "(Ler/a;)Lm2/g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        p076m2.g a(er.a<oq.i0> action);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010!\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/c2$b;", "", "<init>", "()V", "Loq/i0;", "h", "Landroidx/compose/ui/platform/c2$a;", "frameEndScheduler", "i", "(Landroidx/compose/ui/platform/c2$a;)V", "d", "e", "Landroidx/compose/ui/platform/b2;", "a", "Landroidx/compose/ui/platform/b2;", "_retainedValuesStore", "Lz2/f;", "b", "Lz2/f;", "()Lz2/f;", "retainedValuesStore", "", "c", "Z", "()Z", "g", "(Z)V", "isInUse", "Lm2/g;", "value", "Lm2/g;", "f", "(Lm2/g;)V", "endRetainCancellationHandle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b2 _retainedValuesStore;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final z2.f retainedValuesStore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isInUse;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private p076m2.g endRetainCancellationHandle;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.a<oq.i0> {
            a() {
                super(0);
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ oq.i0 a() {
                c();
                return oq.i0.f148189a;
            }

            public final void c() {
                b.this._retainedValuesStore.b();
            }
        }

        public b() {
            b2 b2Var = new b2(null, 1, null);
            this._retainedValuesStore = b2Var;
            this.retainedValuesStore = b2Var;
        }

        private final void f(p076m2.g gVar) {
            p076m2.g gVar2 = this.endRetainCancellationHandle;
            if (gVar2 != null) {
                gVar2.cancel();
            }
            this.endRetainCancellationHandle = gVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final z2.f getRetainedValuesStore() {
            return this.retainedValuesStore;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsInUse() {
            return this.isInUse;
        }

        public final void d() {
            f(null);
            this._retainedValuesStore.a();
        }

        public final void e() {
            this.isInUse = false;
        }

        public final void g(boolean z15) {
            this.isInUse = z15;
        }

        public final void h() {
            if (this._retainedValuesStore.c()) {
                f(null);
            } else {
                this._retainedValuesStore.d();
            }
        }

        public final void i(a frameEndScheduler) {
            p076m2.g gVarA;
            if (this._retainedValuesStore.c()) {
                try {
                    gVarA = frameEndScheduler.a(new a());
                } catch (CancellationException unused) {
                    this._retainedValuesStore.b();
                    gVarA = null;
                }
                f(gVarA);
            }
        }
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        r0.j0<r0.q0<b>> j0Var = this.scopes;
        int[] iArr = j0Var.keys;
        Object[] objArr = j0Var.values;
        long[] jArr = j0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        int i19 = iArr[i18];
                        r0.q0 q0Var = (r0.q0) objArr[i18];
                        Object[] objArr2 = q0Var.content;
                        int i25 = q0Var._size;
                        for (int i26 = 0; i26 < i25; i26++) {
                            ((b) objArr2[i26]).d();
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final b Z8(int viewId) {
        Object obj;
        r0.j0<r0.q0<b>> j0Var = this.scopes;
        r0.q0<b> q0VarB = j0Var.b(viewId);
        if (q0VarB == null) {
            q0VarB = new r0.q0<>(1);
            j0Var.r(viewId, q0VarB);
        }
        r0.q0<b> q0Var = q0VarB;
        Object[] objArr = q0Var.content;
        int i15 = q0Var._size;
        int i16 = 0;
        while (true) {
            if (i16 >= i15) {
                obj = null;
                break;
            }
            obj = objArr[i16];
            if (!((b) obj).getIsInUse()) {
                break;
            }
            i16++;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            bVar = new b();
            q0Var.n(bVar);
        }
        bVar.g(true);
        return bVar;
    }
}
