package uf1;

import fr.t;
import h30.ButtonData;
import iy.c0;
import k30.d;
import mx.Label;
import mx.b;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import sf1.l;
import sf1.m;
import w30.CheckBoxSingleData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Luf1/a;", "Lxw/f;", "Luf1/a$a;", "Lsf1/m$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Luf1/a$a;)Lsf1/m$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, m.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: uf1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u0018\u0010#¨\u0006$"}, d2 = {"Luf1/a$a;", "", "Lsf1/l;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onEmailChanged", "", "onHasNoEmailChanged", "onCheckBoxChanged", "Lkotlin/Function0;", "nextAction", "backAction", "<init>", "(Lsf1/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsf1/l;", "f", "()Lsf1/l;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onEmailChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onHasNoEmailChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onCheckBoxChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(l lVar, er.l<? super String, i0> lVar2, er.l<? super Boolean, i0> lVar3, er.l<? super Boolean, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = lVar;
            this.onEmailChanged = lVar2;
            this.onHasNoEmailChanged = lVar3;
            this.onCheckBoxChanged = lVar4;
            this.nextAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final er.l<Boolean, i0> c() {
            return this.onCheckBoxChanged;
        }

        public final er.l<String, i0> d() {
            return this.onEmailChanged;
        }

        public final er.l<Boolean, i0> e() {
            return this.onHasNoEmailChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEmailChanged, params.onEmailChanged) && t.c(this.onHasNoEmailChanged, params.onHasNoEmailChanged) && t.c(this.onCheckBoxChanged, params.onCheckBoxChanged) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final l getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onEmailChanged.hashCode()) * 31) + this.onHasNoEmailChanged.hashCode()) * 31) + this.onCheckBoxChanged.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEmailChanged=" + this.onEmailChanged + ", onHasNoEmailChanged=" + this.onHasNoEmailChanged + ", onCheckBoxChanged=" + this.onCheckBoxChanged + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a b(Params params) {
        l state = params.getState();
        if (!(state instanceof l.Initialized)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(ha1.a.f82396f1);
        Label labelC2 = this.labelProvider.c(ha1.a.X5);
        er.a<i0> aVarA = params.a();
        Label labelC3 = this.labelProvider.c(ha1.a.f82486r);
        int iB = v4.t.INSTANCE.b();
        l.Initialized initialized = (l.Initialized) state;
        v50.c.Text text = new v50.c.Text(null, labelC3, null, b.b(c0.e(initialized.getEmail().getValue()), "email"), initialized.getEmail().getValidationState(), null, null, params.d(), null, false, iB, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 916325, null);
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, initialized.getHasNoEmail(), params.e(), this.labelProvider.c(ha1.a.W5), null, null, null, null, 241, null);
        r30.b.a aVar = r30.b.a.f171263a;
        return new m.a.FormDisplayed(labelC, labelC2, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), d.a.f107773a, null, params.b(), 35, null), text, new CheckBoxSingleData(checkBoxRowData, aVar, null, false, null, 28, null), new CheckBoxSingleData(new CheckBoxRowData(null, initialized.getCeidgConsent(), params.c(), this.labelProvider.c(ha1.a.f82364b1), null, null, null, null, 241, null), aVar, null, false, null, 28, null), aVarA);
    }
}
