package su2;

import er.l;
import er.p;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import u50.v0;
import v50.c;
import y2.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsu2/b;", "Lb50/a;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "value", "Lkotlin/Function1;", "", "Loq/i0;", "onValueChanged", "Lhz/b;", "validationState", "<init>", "(Lmx/a;Lmx/a;Ler/l;Lhz/b;)V", "Lkotlin/Function0;", "a", "()Ler/p;", "Lmx/a;", "b", "c", "Ler/l;", "d", "Lhz/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b50.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f184424e = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<String, i0> onValueChanged;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.b validationState;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Label label, Label label2, l<? super String, i0> lVar, hz.b bVar) {
        this.label = label;
        this.value = label2;
        this.onValueChanged = lVar;
        this.validationState = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1366555093, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.companydata.content.CompanyDataTextInput.content.<anonymous> (CompanyDataTextInput.kt:16)");
            }
            v0.g(new c.Number(null, bVar.label, null, bVar.value, bVar.validationState, null, null, bVar.onValueChanged, null, false, 0, null, false, null, false, null, null, null, null, false, 1048421, null), null, rVar, c.Number.P, 2);
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
        return m.b(1366555093, true, new p() { // from class: su2.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(this.f184423a, (r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
