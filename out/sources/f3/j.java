package f3;

import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import fr.w0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lf3/m;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v1;", "Loq/i0;", "inspectorInfo", "factory", "b", "(Lf3/m;Ler/l;Ler/q;)Lf3/m;", "Lm2/r;", "modifier", "e", "(Lm2/r;Lf3/m;)Lf3/m;", "d", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/m$b;", "it", "", "c", "(Lf3/m$b;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<m.b, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f58738b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(m.b bVar) {
            return Boolean.valueOf(!(bVar instanceof i));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf3/m;", "acc", "Lf3/m$b;", "element", "c", "(Lf3/m;Lf3/m$b;)Lf3/m;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.p<m, m.b, m> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p076m2.r f58739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p076m2.r rVar) {
            super(2);
            this.f58739b = rVar;
        }

        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m B(m mVar, m.b bVar) {
            boolean z15 = bVar instanceof i;
            m mVarD = bVar;
            if (z15) {
                mVarD = j.d(this.f58739b, (m) ((er.q) w0.g(((i) bVar).a(), 3)).w(m.INSTANCE, this.f58739b, 0));
            }
            return mVar.u(mVarD);
        }
    }

    public static final m b(m mVar, er.l<? super v1, i0> lVar, er.q<? super m, ? super p076m2.r, ? super Integer, ? extends m> qVar) {
        return mVar.u(new i(lVar, qVar));
    }

    public static /* synthetic */ m c(m mVar, er.l lVar, er.q qVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = t1.a();
        }
        return b(mVar, lVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m d(p076m2.r rVar, m mVar) {
        if (mVar.d(a.f58738b)) {
            return mVar;
        }
        rVar.C(1219399079);
        m mVar2 = (m) mVar.b(m.INSTANCE, new b(rVar));
        rVar.V();
        return mVar2;
    }

    public static final m e(p076m2.r rVar, m mVar) {
        rVar.X(439770924);
        m mVarD = d(rVar, mVar);
        rVar.R();
        return mVarD;
    }
}
