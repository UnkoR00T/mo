package p114t0;

import c5.r;
import er.p;
import fr.w;
import m3.g;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.s0;
import p071kotlin.Metadata;
import u0.g4;
import u0.j0;
import u0.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lf3/m;", "Le4/s0;", "lookaheadScope", "modifier", "Lt0/q;", "boundsTransform", "", "animateMotionFrameOfReference", "c", "(Lf3/m;Le4/s0;Lf3/m;Lt0/q;Z)Lf3/m;", "a", "Lt0/q;", "DefaultBoundsTransform", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f186224a = new q() { // from class: t0.b
        @Override // p114t0.q
        public final j0 a(g gVar, g gVar2) {
            return c.b(gVar, gVar2);
        }
    };

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc5/r;", "<unused var>", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "c", "(JJ)J"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements p<r, c5.b, c5.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f186225b = new a();

        a() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ c5.b B(r rVar, c5.b bVar) {
            return c5.b.a(c(rVar.getPackedValue(), bVar.getValue()));
        }

        public final long c(long j15, long j16) {
            return j16;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc5/r;", "animatedSize", "Lc5/b;", "<unused var>", "c", "(JJ)J"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements p<r, c5.b, c5.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f186226b = new b();

        b() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ c5.b B(r rVar, c5.b bVar) {
            return c5.b.a(c(rVar.getPackedValue(), bVar.getValue()));
        }

        public final long c(long j15, long j16) {
            return c5.b.INSTANCE.c((int) (j15 >> 32), (int) (j15 & BodyPartID.bodyIdMax));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 b(g gVar, g gVar2) {
        return m.i(1.0f, 400.0f, g4.g(g.INSTANCE));
    }

    public static final f3.m c(f3.m mVar, s0 s0Var, f3.m mVar2, q qVar, boolean z15) {
        return mVar.u(new o(s0Var, qVar, a.f186225b, z15)).u(mVar2).u(new o(s0Var, qVar, b.f186226b, z15));
    }

    public static /* synthetic */ f3.m d(f3.m mVar, s0 s0Var, f3.m mVar2, q qVar, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            mVar2 = f3.m.INSTANCE;
        }
        if ((i15 & 4) != 0) {
            qVar = f186224a;
        }
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        return c(mVar, s0Var, mVar2, qVar, z15);
    }
}
