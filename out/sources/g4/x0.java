package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lg4/x0;", "Lg4/b1;", "Lg4/v0;", "observerNode", "<init>", "(Lg4/v0;)V", "a", "Lg4/v0;", "b", "()Lg4/v0;", "", "K1", "()Z", "isValidOwnerScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f70419c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final er.l<x0, oq.i0> f70420d = a.f70422b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 observerNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/x0;", "it", "Loq/i0;", "c", "(Lg4/x0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<x0, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f70422b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(x0 x0Var) {
            c(x0Var);
            return oq.i0.f148189a;
        }

        public final void c(x0 x0Var) {
            if (x0Var.K1()) {
                x0Var.getObserverNode().T0();
            }
        }
    }

    /* JADX INFO: renamed from: g4.x0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg4/x0$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Lg4/x0;", "Loq/i0;", "OnObserveReadsChanged", "Ler/l;", "a", "()Ler/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final er.l<x0, oq.i0> a() {
            return x0.f70420d;
        }

        private Companion() {
        }
    }

    public x0(v0 v0Var) {
        this.observerNode = v0Var;
    }

    @Override // g4.b1
    public boolean K1() {
        return this.observerNode.getNode().getIsAttached();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v0 getObserverNode() {
        return this.observerNode;
    }
}
