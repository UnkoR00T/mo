package b1;

import mu.a0;
import mu.h0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb1/m;", "Lb1/l;", "<init>", "()V", "Lb1/i;", "interaction", "Loq/i0;", "a", "(Lb1/i;Ltq/e;)Ljava/lang/Object;", "", "b", "(Lb1/i;)Z", "Lmu/a0;", "Lmu/a0;", "d", "()Lmu/a0;", "interactions", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0<i> interactions = h0.b(0, 16, lu.a.DROP_OLDEST, 1, null);

    @Override // b1.l
    public Object a(i iVar, tq.e<? super i0> eVar) {
        Object objF = c().F(iVar, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // b1.l
    public boolean b(i interaction) {
        return c().f(interaction);
    }

    @Override // b1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a0<i> c() {
        return this.interactions;
    }
}
