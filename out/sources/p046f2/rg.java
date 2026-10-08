package p046f2;

import c5.y;
import fr.k;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import tq.e;
import u0.c0;
import u0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 R\"\u0010(\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\n\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lf2/rg;", "Lf2/ur;", "Lf2/yr;", "state", "Lkotlin/Function0;", "", "canScroll", "isScrollingContentAtStart", "<init>", "(Lf2/yr;Ler/a;Ler/a;)V", "a", "Lf2/yr;", "getState", "()Lf2/yr;", "b", "Ler/a;", "i", "()Ler/a;", "c", "d", "Z", "()Z", "isPinned", "Lu0/l;", "", "e", "Lu0/l;", "()Lu0/l;", "snapAnimationSpec", "Lu0/c0;", "f", "Lu0/c0;", "()Lu0/c0;", "flingAnimationSpec", "Lz3/a;", "g", "Lz3/a;", "()Lz3/a;", "setNestedScrollConnection", "(Lz3/a;)V", "nestedScrollConnection", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class rg implements ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yr state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> canScroll;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> isScrollingContentAtStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c0<Float> flingAnimationSpec;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private z3.a nestedScrollConnection;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"f2/rg$a", "Lz3/a;", "Lm3/e;", "consumed", "available", "Lz3/g;", "source", "d1", "(JJI)J", "Lc5/y;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements z3.a {
        a() {
        }

        @Override // z3.a
        public Object W0(long j15, long j16, e<? super y> eVar) {
            if (y.i(j16) > 0.0f) {
                rg.this.getState().m(0.0f);
            }
            return super.W0(j15, j16, eVar);
        }

        @Override // z3.a
        public long d1(long consumed, long available, int source) {
            if (!rg.this.i().a().booleanValue()) {
                return m3.e.INSTANCE.c();
            }
            yr state = rg.this.getState();
            state.m(state.h() + Float.intBitsToFloat((int) (consumed & BodyPartID.bodyIdMax)));
            return m3.e.INSTANCE.c();
        }
    }

    public rg(yr yrVar, er.a<Boolean> aVar, er.a<Boolean> aVar2) {
        this.state = yrVar;
        this.canScroll = aVar;
        this.isScrollingContentAtStart = aVar2;
        getState().p(aVar2);
        this.isPinned = true;
        this.nestedScrollConnection = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h() {
        return true;
    }

    @Override // p046f2.ur
    /* JADX INFO: renamed from: a, reason: from getter */
    public z3.a getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // p046f2.ur
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    @Override // p046f2.ur
    public c0<Float> c() {
        return this.flingAnimationSpec;
    }

    @Override // p046f2.ur
    public l<Float> d() {
        return this.snapAnimationSpec;
    }

    @Override // p046f2.ur
    public yr getState() {
        return this.state;
    }

    public final er.a<Boolean> i() {
        return this.canScroll;
    }

    public /* synthetic */ rg(yr yrVar, er.a aVar, er.a aVar2, int i15, k kVar) {
        this(yrVar, (i15 & 2) != 0 ? new er.a() { // from class: f2.pg
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(rg.g());
            }
        } : aVar, (i15 & 4) != 0 ? new er.a() { // from class: f2.qg
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(rg.h());
            }
        } : aVar2);
    }
}
