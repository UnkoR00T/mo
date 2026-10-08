package v52;

import androidx.p016lifecycle.t0;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import mx.Label;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import s52.StampDutyPaymentsSummaryData;
import vq.k;
import y52.StampDutyCommitmentTypeData;
import y52.StampDutyCommitmentVariantData;
import y52.StampDutyInstitutionsData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010/¨\u00061"}, d2 = {"Lv52/d;", "Landroidx/lifecycle/t0;", "", "Lw52/d;", "dataSourceContract", "Lmx/c;", "labelProvider", "<init>", "(Lw52/d;Lmx/c;)V", "Loq/i0;", "a9", "()V", "Ly52/a;", "data", "X7", "(Ly52/a;)V", "Ly52/b;", "T3", "(Ly52/b;)V", i.f37089p, "Ly52/d;", "L1", "(Ly52/d;)V", "", "J8", "()Ljava/lang/String;", "Ly52/g;", "S5", "(Ly52/g;)V", "b", "Lw52/d;", "c", "Lmx/c;", "Lxw/b;", "Lv52/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "X0", "()Ly52/a;", "commitmentTypeData", "i", "()Ly52/g;", "personalData", "Ls52/a;", "()Ls52/a;", "summaryData", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends t0 implements w52.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w52.d dataSourceContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v52.a> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204046e;

        /* JADX INFO: renamed from: v52.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class C5318a extends k implements l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f204048e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f204049f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5318a(d dVar, tq.e<? super C5318a> eVar) {
                super(1, eVar);
                this.f204049f = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f204048e;
                if (i15 == 0) {
                    u.b(obj);
                    xw.b<v52.a> bVarY1 = this.f204049f.Y1();
                    v52.a.C5317a c5317a = v52.a.C5317a.f204040a;
                    this.f204048e = 1;
                    if (bVarY1.F(c5317a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new C5318a(this.f204049f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((C5318a) M(eVar)).J(i0.f148189a);
            }
        }

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(d dVar) {
            i00.a.a(dVar, new C5318a(dVar, null));
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204046e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<v52.a> bVarY1 = d.this.Y1();
                h.b bVar = h.b.f24985a;
                Label labelC = d.this.labelProvider.c(t32.b.f187439b1);
                Label labelC2 = d.this.labelProvider.c(t32.b.f187441c);
                final d dVar = d.this;
                v52.a.ShowCloseProcessDialog showCloseProcessDialog = new v52.a.ShowCloseProcessDialog(new DialogData(bVar, labelC, null, new DialogButtonTextData(labelC2, null, new er.a() { // from class: v52.b
                    @Override // er.a
                    public final Object a() {
                        return d.a.X(dVar);
                    }
                }, 2, null), new DialogButtonTextData(d.this.labelProvider.c(t32.b.f187490s), null, new er.a() { // from class: v52.c
                    @Override // er.a
                    public final Object a() {
                        return d.a.Y();
                    }
                }, 2, null), null, null, 100, null));
                this.f204046e = 1;
                if (bVarY1.F(showCloseProcessDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> O(tq.e<?> eVar) {
            return d.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) O(eVar)).J(i0.f148189a);
        }
    }

    public d(w52.d dVar, mx.c cVar) {
        this.dataSourceContract = dVar;
        this.labelProvider = cVar;
    }

    @Override // w52.b
    public void H2(StampDutyCommitmentVariantData data) {
        this.dataSourceContract.H2(data);
    }

    @Override // w52.c
    public String J8() {
        return this.dataSourceContract.J8();
    }

    @Override // w52.c
    public void L1(StampDutyInstitutionsData data) {
        this.dataSourceContract.L1(data);
    }

    @Override // w52.f
    public void S5(y52.g data) {
        this.dataSourceContract.S5(data);
    }

    @Override // w52.a
    public void T3(StampDutyCommitmentVariantData data) {
        this.dataSourceContract.T3(data);
    }

    @Override // w52.a
    public StampDutyCommitmentTypeData X0() {
        return this.dataSourceContract.X0();
    }

    @Override // w52.a
    public void X7(StampDutyCommitmentTypeData data) {
        this.dataSourceContract.X7(data);
    }

    public xw.b<v52.a> Y1() {
        return this.navAction;
    }

    public void a9() {
        i00.a.a(this, new a(null));
    }

    @Override // w52.g
    public StampDutyPaymentsSummaryData c() {
        return this.dataSourceContract.c();
    }

    @Override // w52.f
    public y52.g i() {
        return this.dataSourceContract.i();
    }
}
