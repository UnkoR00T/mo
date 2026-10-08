package oy1;

import cx1.NfcScreenModel;
import h30.ButtonData;
import i50.BaseScaffoldData;
import lw1.j0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Loy1/z;", "Lxw/f;", "Loy1/z$a;", "Lny1/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "description", "Lcx1/a;", "h", "(Loy1/z$a;Lmx/a;Lmx/a;)Lcx1/a;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "l", "(Ler/a;)Li50/a;", "Lcy/c;", "v", "(Lcy/c;)Lmx/a;", "u", "z", "x", "params", "m", "(Loy1/z$a;)Lny1/e$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements xw.f<Params, ny1.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: oy1.z$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Loy1/z$a;", "", "Lny1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseAction", "Lkotlin/Function1;", "Lpy1/c;", "onFinishAction", "<init>", "(Lny1/d;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lny1/d;", "d", "()Lny1/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ny1.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<py1.c, i0> onFinishAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ny1.d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super py1.c, i0> lVar) {
            this.state = dVar;
            this.onBackAction = aVar;
            this.onCloseAction = aVar2;
            this.onFinishAction = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.l<py1.c, i0> c() {
            return this.onFinishAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ny1.d getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.onCloseAction, params.onCloseAction) && fr.t.c(this.onFinishAction, params.onFinishAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onFinishAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onFinishAction=" + this.onFinishAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150672a;

        static {
            int[] iArr = new int[yw1.a.values().length];
            try {
                iArr[yw1.a.AUTHENTICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yw1.a.AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f150672a = iArr;
        }
    }

    public z(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final NfcScreenModel h(Params params, Label label, Label label2) {
        return new NfcScreenModel(l(params.b()), label, label2, null, params.a(), params.getState().getAreAnimationsEnabled(), 8, null);
    }

    static /* synthetic */ NfcScreenModel i(z zVar, Params params, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = zVar.labelProvider.c(j0.f120797v0);
        }
        if ((i15 & 2) != 0) {
            label2 = zVar.labelProvider.c(j0.f120793u0);
        }
        return zVar.h(params, label, label2);
    }

    private final BaseScaffoldData l(er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), null, null, null, null, 30, null), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, ny1.d dVar) {
        params.c().b(new py1.c.Success(((ny1.d.b.Successful) dVar).getFormData().getCan()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, ny1.d dVar) {
        params.c().b(new py1.c.Success(((ny1.d.b.Successful) dVar).getFormData().getCan()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, ny1.d dVar) {
        params.c().b(new py1.c.Success(((ny1.d.b.Successful) dVar).getFormData().getCan()));
        return i0.f148189a;
    }

    private final Label u(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.B) : this.labelProvider.c(j0.f120780r);
        }
        if (!(cVar instanceof cy.c.Progress)) {
            if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Finished)) {
                return this.labelProvider.c(j0.P);
            }
            throw new oq.p();
        }
        return this.labelProvider.c(j0.P).o(mx.b.b('\n' + ((cy.c.Progress) cVar).getProgress() + " %", "progress"));
    }

    private final Label v(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.C) : this.labelProvider.c(j0.f120735i);
        }
        if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info)) {
            return this.labelProvider.c(j0.Q);
        }
        if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Progress)) {
            return this.labelProvider.c(j0.L0);
        }
        throw new oq.p();
    }

    private final Label x(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.B) : this.labelProvider.c(j0.f120780r);
        }
        if (!(cVar instanceof cy.c.Progress)) {
            if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Finished)) {
                return this.labelProvider.c(j0.P);
            }
            throw new oq.p();
        }
        return this.labelProvider.c(j0.P).o(mx.b.b('\n' + ((cy.c.Progress) cVar).getProgress() + " %", "progress"));
    }

    private final Label z(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(j0.C) : this.labelProvider.c(j0.f120735i);
        }
        if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info)) {
            return this.labelProvider.c(j0.Q);
        }
        if ((cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Progress)) {
            return this.labelProvider.c(j0.f120774p3);
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ny1.e.a b(final Params params) {
        int i15;
        final ny1.d state = params.getState();
        if ((state instanceof ny1.d.Initial) || (state instanceof ny1.d.b.CheckNfc)) {
            return new ny1.e.a.NfcInfo(i(this, params, null, null, 3, null));
        }
        if (state instanceof ny1.d.b.ReadCert) {
            cy.c lastReadingData = ((ny1.d.b.ReadCert) state).getLastReadingData();
            return ((lastReadingData instanceof cy.c.Started) || lastReadingData == null) ? new ny1.e.a.NfcInfo(i(this, params, null, null, 3, null)) : new ny1.e.a.NfcScanning(h(params, v(lastReadingData), u(lastReadingData)));
        }
        if (state instanceof ny1.d.b.CompareCertData) {
            return new ny1.e.a.NfcScanning(h(params, this.labelProvider.c(j0.f120779q3), this.labelProvider.c(j0.Y0)));
        }
        if (state instanceof ny1.d.b.ResetPin) {
            cy.c lastReadingData2 = ((ny1.d.b.ResetPin) state).getLastReadingData();
            return ((lastReadingData2 instanceof cy.c.Started) || lastReadingData2 == null) ? new ny1.e.a.NfcInfo(i(this, params, null, null, 3, null)) : new ny1.e.a.NfcScanning(h(params, z(lastReadingData2), x(lastReadingData2)));
        }
        if (!(state instanceof ny1.d.b.Successful)) {
            if (state instanceof ny1.d.b.Error) {
                return new ny1.e.a.Error(((ny1.d.b.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldDataL = l(new er.a() { // from class: oy1.w
            @Override // er.a
            public final Object a() {
                return z.q(params, state);
            }
        });
        q40.j.b.c cVar = q40.j.b.c.f164688d;
        mx.c cVar2 = this.labelProvider;
        int i16 = b.f150672a[((ny1.d.b.Successful) state).getFormData().getCertificateType().ordinal()];
        if (i16 == 1) {
            i15 = j0.K2;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = j0.M2;
        }
        return new ny1.e.a.ResetPinSuccessful(baseScaffoldDataL, new IconPageData(cVar, cVar2.c(i15), null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120725g), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: oy1.x
            @Override // er.a
            public final Object a() {
                return z.r(params, state);
            }
        }, 35, null), null, null, 6, null), true, 12, null), new er.a() { // from class: oy1.y
            @Override // er.a
            public final Object a() {
                return z.s(params, state);
            }
        });
    }
}
