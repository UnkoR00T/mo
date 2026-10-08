package p114t0;

import c5.d;
import c5.r;
import c5.t;
import er.l;
import fr.w;
import g4.l0;
import k3.f;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.x1;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.x5;
import r0.g1;
import r0.t0;
import u0.j0;
import u0.k2;
import u0.m;
import u0.q;
import u0.s3;
import u0.v2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0014\u000e\u001dB'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020#8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R,\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0,0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R*\u00108\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010;\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010:¨\u0006?²\u0006\u000e\u0010>\u001a\u00020=8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lt0/i;", ip.a.f96137b, "Lt0/h;", "Lu0/k2;", "transition", "Lf3/c;", "contentAlignment", "Lc5/t;", "layoutDirection", "<init>", "(Lu0/k2;Lf3/c;Lc5/t;)V", "Lt0/v;", "Lt0/y0;", "sizeTransform", "b", "(Lt0/v;Lt0/y0;)Lt0/v;", "contentTransform", "Lf3/m;", "d", "(Lt0/v;Lm2/r;I)Lf3/m;", "a", "Lu0/k2;", "getTransition$animation", "()Lu0/k2;", "Lf3/c;", "g", "()Lf3/c;", "j", "(Lf3/c;)V", "c", "Lc5/t;", "getLayoutDirection$animation", "()Lc5/t;", "k", "(Lc5/t;)V", "Lc5/r;", "<set-?>", "Lm2/a3;", "getMeasuredSize-YbymL2g$animation", "()J", "l", "(J)V", "measuredSize", "Lr0/t0;", "Lm2/f6;", "e", "Lr0/t0;", "h", "()Lr0/t0;", "targetSizeMap", "f", "Lm2/f6;", "getAnimatedSize$animation", "()Lm2/f6;", "i", "(Lm2/f6;)V", "animatedSize", "J0", "()Ljava/lang/Object;", "initialState", "targetState", "", "shouldAnimateSize", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<S> implements h<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k2<S> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private f3.c contentAlignment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 measuredSize = c6.e(r.b(r.INSTANCE.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t0<S, f6<r>> targetSizeMap = g1.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private f6<r> animatedSize;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Lt0/i$a;", "Le4/x1;", "", "isTarget", "<init>", "(Z)V", "Lc5/d;", "", "parentData", "n", "(Lc5/d;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "d", "Lm2/a3;", "a", "()Z", "l", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements x1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final a3 isTarget;

        public a(boolean z15) {
            this.isTarget = c6.e(Boolean.valueOf(z15), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.isTarget.getValue()).booleanValue();
        }

        public final void l(boolean z15) {
            this.isTarget.setValue(Boolean.valueOf(z15));
        }

        @Override // p036e4.x1
        public Object n(d dVar, Object obj) {
            return this;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lt0/i$b;", ip.a.f96137b, "Lg4/l0;", "Lt0/i$c;", "Lu0/k2$a;", "Lc5/r;", "Lu0/q;", "Lu0/k2;", "sizeAnimation", "Lm2/f6;", "Lt0/y0;", "sizeTransform", "Lt0/i;", "scope", "<init>", "(Lu0/k2$a;Lm2/f6;Lt0/i;)V", "a", "()Lt0/i$c;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "node", "Loq/i0;", "l", "(Lt0/i$c;)V", "d", "Lu0/k2$a;", "getSizeAnimation", "()Lu0/k2$a;", "e", "Lm2/f6;", "getSizeTransform", "()Lm2/f6;", "f", "Lt0/i;", "getScope", "()Lt0/i;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b<S> extends l0<c<S>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final k2<S>.a<r, q> sizeAnimation;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final f6<y0> sizeTransform;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final i<S> scope;

        /* JADX WARN: Multi-variable type inference failed */
        public b(k2<S>.a<r, q> aVar, f6<? extends y0> f6Var, i<S> iVar) {
            this.sizeAnimation = aVar;
            this.sizeTransform = f6Var;
            this.scope = iVar;
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<S> create() {
            return new c<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return fr.t.c(bVar.sizeAnimation, this.sizeAnimation) && fr.t.c(bVar.sizeTransform, this.sizeTransform);
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            k2<S>.a<r, q> aVar = this.sizeAnimation;
            return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void update(c<S> node) {
            node.s3(this.sizeAnimation);
            node.t3(this.sizeTransform);
            node.r3(this.scope);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR:\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lt0/i$c;", ip.a.f96137b, "Lt0/l0;", "Lu0/k2$a;", "Lc5/r;", "Lu0/q;", "Lu0/k2;", "sizeAnimation", "Lm2/f6;", "Lt0/y0;", "sizeTransform", "Lt0/i;", "scope", "<init>", "(Lu0/k2$a;Lm2/f6;Lt0/i;)V", "default", "q3", "(J)J", "Loq/i0;", "Y2", "()V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "s", "Lu0/k2$a;", "getSizeAnimation", "()Lu0/k2$a;", "s3", "(Lu0/k2$a;)V", "t", "Lm2/f6;", "p3", "()Lm2/f6;", "t3", "(Lm2/f6;)V", "v", "Lt0/i;", "o3", "()Lt0/i;", "r3", "(Lt0/i;)V", "w", "J", "lastSize", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c<S> extends l0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private k2<S>.a<r, q> sizeAnimation;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private f6<? extends y0> sizeTransform;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private i<S> scope;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private long lastSize = d.f186230a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends w implements l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<S> f186314b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a2 f186315c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f186316d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c<S> cVar, a2 a2Var, long j15) {
                super(1);
                this.f186314b = cVar;
                this.f186315c = a2Var;
                this.f186316d = j15;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                a2.a.G(aVar, this.f186315c, this.f186314b.o3().getContentAlignment().a(r.c((((long) this.f186315c.getWidth()) << 32) | (((long) this.f186315c.getHeight()) & BodyPartID.bodyIdMax)), this.f186316d, t.Ltr), 0.0f, 2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ip.a.f96137b, "Lu0/k2$b;", "Lu0/j0;", "Lc5/r;", "c", "(Lu0/k2$b;)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
        static final class b extends w implements l<k2.b<S>, j0<r>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<S> f186317b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f186318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c<S> cVar, long j15) {
                super(1);
                this.f186317b = cVar;
                this.f186318c = j15;
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final j0<r> b(k2.b<S> bVar) {
                long packedValue;
                j0<r> j0VarA;
                if (fr.t.c(bVar.J0(), this.f186317b.o3().J0())) {
                    packedValue = this.f186317b.q3(this.f186318c);
                } else {
                    f6<r> f6VarE = this.f186317b.o3().h().e(bVar.J0());
                    packedValue = f6VarE != null ? f6VarE.getValue().getPackedValue() : r.INSTANCE.a();
                }
                f6<r> f6VarE2 = this.f186317b.o3().h().e(bVar.a());
                long packedValue2 = f6VarE2 != null ? f6VarE2.getValue().getPackedValue() : r.INSTANCE.a();
                y0 value = this.f186317b.p3().getValue();
                return (value == null || (j0VarA = value.a(packedValue, packedValue2)) == null) ? m.j(0.0f, 400.0f, null, 5, null) : j0VarA;
            }
        }

        /* JADX INFO: renamed from: t0.i$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ip.a.f96137b, "it", "Lc5/r;", "c", "(Ljava/lang/Object;)J"}, k = 3, mv = {2, 1, 0})
        static final class C4819c extends w implements l<S, r> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<S> f186319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f186320c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4819c(c<S> cVar, long j15) {
                super(1);
                this.f186319b = cVar;
                this.f186320c = j15;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ r b(Object obj) {
                return r.b(c(obj));
            }

            public final long c(S s15) {
                if (fr.t.c(s15, this.f186319b.o3().J0())) {
                    return this.f186319b.q3(this.f186320c);
                }
                f6<r> f6VarE = this.f186319b.o3().h().e(s15);
                return f6VarE != null ? f6VarE.getValue().getPackedValue() : r.INSTANCE.a();
            }
        }

        public c(k2<S>.a<r, q> aVar, f6<? extends y0> f6Var, i<S> iVar) {
            this.sizeAnimation = aVar;
            this.sizeTransform = f6Var;
            this.scope = iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long q3(long j15) {
            return r.e(this.lastSize, d.f186230a) ? j15 : this.lastSize;
        }

        @Override // f3.m.c
        public void Y2() {
            super.Y2();
            this.lastSize = d.f186230a;
        }

        @Override // g4.z
        public x0 c(y0 y0Var, v0 v0Var, long j15) {
            long packedValue;
            a2 a2VarO0 = v0Var.o0(j15);
            if (y0Var.J0()) {
                packedValue = r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax));
            } else if (this.sizeAnimation == null) {
                packedValue = r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax));
                this.lastSize = r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax));
            } else {
                long jC = r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax));
                f6<r> f6VarA = this.sizeAnimation.a(new b(this, jC), new C4819c(this, jC));
                this.scope.i(f6VarA);
                packedValue = f6VarA.getValue().getPackedValue();
                this.lastSize = f6VarA.getValue().getPackedValue();
            }
            return y0.j2(y0Var, (int) (packedValue >> 32), (int) (packedValue & BodyPartID.bodyIdMax), null, new a(this, a2VarO0, packedValue), 4, null);
        }

        public final i<S> o3() {
            return this.scope;
        }

        public final f6<y0> p3() {
            return this.sizeTransform;
        }

        public final void r3(i<S> iVar) {
            this.scope = iVar;
        }

        public final void s3(k2<S>.a<r, q> aVar) {
            this.sizeAnimation = aVar;
        }

        public final void t3(f6<? extends y0> f6Var) {
            this.sizeTransform = f6Var;
        }
    }

    public i(k2<S> k2Var, f3.c cVar, t tVar) {
        this.transition = k2Var;
        this.contentAlignment = cVar;
        this.layoutDirection = tVar;
    }

    private static final boolean e(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void f(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    @Override // u0.k2.b
    public S J0() {
        return this.transition.u().J0();
    }

    @Override // u0.k2.b
    public S a() {
        return this.transition.u().a();
    }

    @Override // p114t0.h
    public v b(v vVar, y0 y0Var) {
        vVar.e(y0Var);
        return vVar;
    }

    public final f3.m d(v vVar, p076m2.r rVar, int i15) {
        f3.m mVar;
        if (p076m2.t.k()) {
            p076m2.t.o(93755870, i15, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:557)");
        }
        boolean zW = rVar.W(this);
        Object objE = rVar.E();
        k2.a aVarP = null;
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = c6.e(Boolean.FALSE, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        f6 f6VarP = x5.p(vVar.getSizeTransform(), rVar, 0);
        if (fr.t.c(this.transition.p(), this.transition.w())) {
            f(a3Var, false);
        } else if (f6VarP.getValue() != null) {
            f(a3Var, true);
        }
        if (e(a3Var)) {
            rVar.X(1353077497);
            aVarP = v2.p(this.transition, s3.O(r.INSTANCE), null, rVar, 0, 2);
            boolean zW2 = rVar.W(aVarP);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                y0 y0Var = (y0) f6VarP.getValue();
                objE2 = (y0Var == null || y0Var.getClip()) ? f.b(f3.m.INSTANCE) : f3.m.INSTANCE;
                rVar.v(objE2);
            }
            mVar = (f3.m) objE2;
            rVar.R();
        } else {
            rVar.X(1353343539);
            rVar.R();
            this.animatedSize = null;
            mVar = f3.m.INSTANCE;
        }
        f3.m mVarU = mVar.u(new b(aVarP, f6VarP, this));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public f3.c getContentAlignment() {
        return this.contentAlignment;
    }

    public final t0<S, f6<r>> h() {
        return this.targetSizeMap;
    }

    public final void i(f6<r> f6Var) {
        this.animatedSize = f6Var;
    }

    public void j(f3.c cVar) {
        this.contentAlignment = cVar;
    }

    public final void k(t tVar) {
        this.layoutDirection = tVar;
    }

    public final void l(long j15) {
        this.measuredSize.setValue(r.b(j15));
    }
}
