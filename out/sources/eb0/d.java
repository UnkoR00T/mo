package eb0;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Leb0/d;", "Lxw/f;", "Leb0/d$a;", "Leb0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Leb0/d$a;)Leb0/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onTerminateAction", "onAbortTerminateDialogAction", "Lcb4/d;", "f", "(Ler/a;Ler/a;)Lcb4/d;", "Lp50/a$a;", "e", "()Lp50/a$a;", "a", "Lmx/c;", "documentloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: eb0.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Leb0/d$a;", "", "Leb0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "abortAction", "backAction", "<init>", "(Leb0/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leb0/b;", "c", "()Leb0/b;", "b", "Ler/a;", "()Ler/a;", "documentloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eb0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> abortAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        public Params(eb0.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.abortAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.abortAction;
        }

        public final er.a<i0> b() {
            return this.backAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final eb0.b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.abortAction, params.abortAction) && fr.t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.abortAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", abortAction=" + this.abortAction + ", backAction=" + this.backAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49117a;

        static {
            int[] iArr = new int[cf0.c.values().length];
            try {
                iArr[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cf0.c.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cf0.c.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cf0.c.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f49117a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        Label labelC;
        Label labelC2;
        eb0.b state = params.getState();
        if (!(state instanceof eb0.b.Observing)) {
            if (state instanceof eb0.b.Error) {
                return new c.a.Error(((eb0.b.Error) params.getState()).getErrorVMSAdapter());
            }
            throw new oq.p();
        }
        cf0.c documentType = ((eb0.b.Observing) params.getState()).getDocumentType();
        int i15 = documentType == null ? -1 : b.f49117a[documentType.ordinal()];
        if (i15 == -1) {
            labelC = Label.INSTANCE.c();
        } else if (i15 == 1) {
            labelC = this.labelProvider.c(cb0.a.f24874n);
        } else if (i15 == 2) {
            labelC = this.labelProvider.c(cb0.a.f24872l);
        } else if (i15 == 3) {
            labelC = this.labelProvider.c(cb0.a.f24873m);
        } else if (i15 == 4) {
            labelC = this.labelProvider.c(cb0.a.f24875o);
        } else {
            if (i15 != 5) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(cb0.a.f24871k);
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), labelC, null, null, null, 28, null), null, null, null, null, 61, null);
        boolean allowTermination = ((eb0.b.Observing) params.getState()).getAllowTermination();
        if (allowTermination) {
            labelC2 = this.labelProvider.c(cb0.a.f24866f).o(mx.b.b("\n", "")).o(this.labelProvider.c(cb0.a.f24864d));
        } else {
            if (allowTermination) {
                throw new oq.p();
            }
            labelC2 = this.labelProvider.c(cb0.a.f24870j);
        }
        Label label = labelC2;
        er.a<i0> aVarB = params.b();
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(cb0.a.f24862b), null, null, params.a(), 13, null);
        if (!((eb0.b.Observing) params.getState()).getAllowTermination()) {
            buttonTextData = null;
        }
        return new c.a.DocumentLoaderData(baseScaffoldData, label, buttonTextData, aVarB, ((eb0.b.Observing) params.getState()).getTerminationDialog());
    }

    public final p50.a.Default e() {
        return new p50.a.Default(this.labelProvider.c(cb0.a.f24865e), false, null, 6, null);
    }

    public final DialogData f(er.a<i0> onTerminateAction, er.a<i0> onAbortTerminateDialogAction) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(cb0.a.f24869i), this.labelProvider.c(cb0.a.f24868h), new DialogButtonTextData(this.labelProvider.c(cb0.a.f24862b), null, onTerminateAction, 2, null), new DialogButtonTextData(this.labelProvider.c(cb0.a.f24861a), null, onAbortTerminateDialogAction, 2, null), null, onAbortTerminateDialogAction, 32, null);
    }
}
