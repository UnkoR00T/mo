package zu2;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.e0;
import d1.i;
import d1.r3;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import j70.h;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import u50.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lzu2/b;", "Lb50/a;", "Lmx/a;", "description", "peselNumberLabel", "peselNumberContent", "Lhz/b;", "peselNumberValidationState", "Lkotlin/Function1;", "", "Loq/i0;", "onPeselNumberChanged", "idNumberLabel", "idNumberContent", "idNumberValidationState", "onIdNumberChanged", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lhz/b;Ler/l;Lmx/a;Lmx/a;Lhz/b;Ler/l;)V", "Lkotlin/Function0;", "a", "()Ler/p;", "Lmx/a;", "b", "c", "d", "Lhz/b;", "e", "Ler/l;", "f", "g", "h", "i", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b50.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f237846j = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label peselNumberLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Label peselNumberContent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.b peselNumberValidationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String, i0> onPeselNumberChanged;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Label idNumberLabel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Label idNumberContent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hz.b idNumberValidationState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l<String, i0> onIdNumberChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Label label, Label label2, Label label3, hz.b bVar, l<? super String, i0> lVar, Label label4, Label label5, hz.b bVar2, l<? super String, i0> lVar2) {
        this.description = label;
        this.peselNumberLabel = label2;
        this.peselNumberContent = label3;
        this.peselNumberValidationState = bVar;
        this.onPeselNumberChanged = lVar;
        this.idNumberLabel = label4;
        this.idNumberContent = label5;
        this.idNumberValidationState = bVar2;
        this.onIdNumberChanged = lVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1083693597, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.verificationcheck.content.VerificationCheckRadioButtonContent.content.<anonymous> (VerificationCheckRadioButtonContent.kt:29)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            h.g(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i16).getSpacing200(), 7, null), null, bVar.description, null, null, aVar.a(rVar, i16).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            Label label = bVar.peselNumberLabel;
            Label label2 = bVar.peselNumberContent;
            l<String, i0> lVar = bVar.onPeselNumberChanged;
            v4.t.Companion companion3 = v4.t.INSTANCE;
            v0.g(new v50.c.Number(null, label, null, label2, bVar.peselNumberValidationState, null, null, lVar, null, false, companion3.d(), null, false, null, false, null, null, null, null, false, 1047397, null), null, rVar, v50.c.Number.P, 2);
            r3.a(d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            v0.g(new v50.c.Text(null, bVar.idNumberLabel, null, bVar.idNumberContent, bVar.idNumberValidationState, null, null, bVar.onIdNumberChanged, null, false, companion3.d(), null, false, null, false, null, null, null, null, null, 1047397, null), null, rVar, v50.c.Text.P, 2);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // b50.a
    public p<r, Integer, i0> a() {
        return y2.m.b(1083693597, true, new p() { // from class: zu2.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(this.f237845a, (r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
