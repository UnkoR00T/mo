package p056h1;

import c1.e;
import c3.l;
import oq.i0;
import p036e4.y1;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R/\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&\"\u0004\b'\u0010(R(\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010&\"\u0004\b$\u0010(¨\u0006,"}, d2 = {"Lh1/g1;", "Le4/y1;", "Le4/y1$a;", "Lh1/k1$a;", "", "key", "Lh1/k1;", "pinnedItemList", "<init>", "(Ljava/lang/Object;Lh1/k1;)V", "a", "()Le4/y1$a;", "Loq/i0;", "b", "()V", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Lh1/k1;", "", "c", "I", "getIndex", "()I", "f", "(I)V", "index", "d", "pinsCount", "Le4/y1$a;", "parentHandle", "", "Z", "isDisposed", "<set-?>", "g", "Lm2/a3;", "()Le4/y1;", "h", "(Le4/y1;)V", "_parentPinnableContainer", "value", "parentPinnableContainer", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g1 implements y1, y1.a, k1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k1 pinnedItemList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinsCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private y1.a parentHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 _parentPinnableContainer = c6.e(null, null, 2, null);

    public g1(Object obj, k1 k1Var) {
        this.key = obj;
        this.pinnedItemList = k1Var;
    }

    private final y1 d() {
        return (y1) this._parentPinnableContainer.getValue();
    }

    private final void h(y1 y1Var) {
        this._parentPinnableContainer.setValue(y1Var);
    }

    @Override // p036e4.y1
    public y1.a a() {
        if (this.isDisposed) {
            e.c("Pin should not be called on an already disposed item ");
        }
        if (this.pinsCount == 0) {
            this.pinnedItemList.k(this);
            y1 y1VarC = c();
            this.parentHandle = y1VarC != null ? y1VarC.a() : null;
        }
        this.pinsCount++;
        return this;
    }

    @Override // e4.y1.a
    public void b() {
        if (this.isDisposed) {
            return;
        }
        if (!(this.pinsCount > 0)) {
            e.c("Release should only be called once");
        }
        int i15 = this.pinsCount - 1;
        this.pinsCount = i15;
        if (i15 == 0) {
            this.pinnedItemList.l(this);
            y1.a aVar = this.parentHandle;
            if (aVar != null) {
                aVar.b();
            }
            this.parentHandle = null;
        }
    }

    public final y1 c() {
        return d();
    }

    public final void e() {
        this.isDisposed = true;
    }

    public void f(int i15) {
        this.index = i15;
    }

    public final void g(y1 y1Var) {
        l.Companion companion = l.INSTANCE;
        l lVarD = companion.d();
        er.l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
        l lVarE = companion.e(lVarD);
        try {
            if (y1Var != d()) {
                h(y1Var);
                if (this.pinsCount > 0) {
                    y1.a aVar = this.parentHandle;
                    if (aVar != null) {
                        aVar.b();
                    }
                    this.parentHandle = y1Var != null ? y1Var.a() : null;
                }
            }
            i0 i0Var = i0.f148189a;
        } finally {
            companion.l(lVarD, lVarE, lVarG);
        }
    }

    @Override // h1.k1.a
    public int getIndex() {
        return this.index;
    }

    @Override // h1.k1.a
    public Object getKey() {
        return this.key;
    }
}
