package gu1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import fu1.State;
import fu1.c;
import h30.ButtonData;
import hu1.FormFieldData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import java.util.List;
import k30.d;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lgu1/b;", "Lxw/f;", "Lgu1/b$a;", "Lfu1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Lhu1/a;", "e", "(Lgu1/b$a;)Ljava/util/List;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "value", "Lhz/b;", "validationState", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onValueChanged", "Lv4/t;", "imeAction", "helperText", "Lv50/c$g;", "h", "(Lmx/a;Lmx/a;Lhz/b;Ler/l;ILmx/a;)Lv50/c$g;", "f", "(Lgu1/b$a;)Lfu1/c$a;", "a", "Lmx/c;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gu1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010'R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b%\u0010'¨\u0006)"}, d2 = {"Lgu1/b$a;", "", "Lfu1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onFormNumberInfoAction", "onNextAction", "onScrollToFieldAction", "Lkotlin/Function1;", "Liy/b0;", "onNameChangeAction", "onSurnameChangeAction", "onSeriesAndNumberChangeAction", "<init>", "(Lfu1/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfu1/b;", "h", "()Lfu1/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "f", "Ler/l;", "()Ler/l;", "g", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f76989i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFormNumberInfoAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrollToFieldAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onNameChangeAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onSurnameChangeAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onSeriesAndNumberChangeAction;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f76989i = i15 | i16 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3) {
            this.state = state;
            this.onBackAction = aVar;
            this.onFormNumberInfoAction = aVar2;
            this.onNextAction = aVar3;
            this.onScrollToFieldAction = aVar4;
            this.onNameChangeAction = lVar;
            this.onSurnameChangeAction = lVar2;
            this.onSeriesAndNumberChangeAction = lVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onFormNumberInfoAction;
        }

        public final l<b0, i0> c() {
            return this.onNameChangeAction;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        public final er.a<i0> e() {
            return this.onScrollToFieldAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onFormNumberInfoAction, params.onFormNumberInfoAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onScrollToFieldAction, params.onScrollToFieldAction) && t.c(this.onNameChangeAction, params.onNameChangeAction) && t.c(this.onSurnameChangeAction, params.onSurnameChangeAction) && t.c(this.onSeriesAndNumberChangeAction, params.onSeriesAndNumberChangeAction);
        }

        public final l<b0, i0> f() {
            return this.onSeriesAndNumberChangeAction;
        }

        public final l<b0, i0> g() {
            return this.onSurnameChangeAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onFormNumberInfoAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onScrollToFieldAction.hashCode()) * 31) + this.onNameChangeAction.hashCode()) * 31) + this.onSurnameChangeAction.hashCode()) * 31) + this.onSeriesAndNumberChangeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onFormNumberInfoAction=" + this.onFormNumberInfoAction + ", onNextAction=" + this.onNextAction + ", onScrollToFieldAction=" + this.onScrollToFieldAction + ", onNameChangeAction=" + this.onNameChangeAction + ", onSurnameChangeAction=" + this.onSurnameChangeAction + ", onSeriesAndNumberChangeAction=" + this.onSeriesAndNumberChangeAction + ')';
        }
    }

    /* JADX INFO: renamed from: gu1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1743b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1743b f76998a = new C1743b();

        C1743b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1920228419);
            if (p076m2.t.k()) {
                p076m2.t.o(1920228419, i15, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.welcome.mapper.WelcomeMapper.invoke.<anonymous> (WelcomeMapper.kt:57)");
            }
            long jA = ((zt1.a) rVar.N(zt1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<FormFieldData> e(Params params) {
        return v.q(new FormFieldData(FormFieldData.EnumC2027a.NAME, i(this, this.labelProvider.c(vt1.a.f208266b), mx.b.b(c0.e(params.getState().getName()), "nameValue"), params.getState().getNameValidationState(), params.c(), 0, null, 48, null)), new FormFieldData(FormFieldData.EnumC2027a.SURNAME, i(this, this.labelProvider.c(vt1.a.f208267c), mx.b.b(c0.e(params.getState().getSurname()), "surnameValue"), params.getState().getSurnameValidationState(), params.g(), 0, null, 48, null)), new FormFieldData(FormFieldData.EnumC2027a.SERIES_AND_NUMBER, i(this, this.labelProvider.c(vt1.a.f208265a), mx.b.b(c0.e(params.getState().getSeriesAndNumber()), "seriesAndNumberValue"), params.getState().getSeriesAndNumberValidationState(), params.f(), v4.t.INSTANCE.b(), null, 32, null)));
    }

    private final v50.c.Text h(Label label, Label value, hz.b validationState, final l<? super b0, i0> onValueChanged, int imeAction, Label helperText) {
        return new v50.c.Text(null, label, null, value, validationState, helperText, null, new l() { // from class: gu1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.l(onValueChanged, (String) obj);
            }
        }, null, false, imeAction, null, false, null, false, null, null, null, null, null, 1047365, null);
    }

    static /* synthetic */ v50.c.Text i(b bVar, Label label, Label label2, hz.b bVar2, l lVar, int i15, Label label3, int i16, Object obj) {
        if ((i16 & 16) != 0) {
            i15 = v4.t.INSTANCE.d();
        }
        int i17 = i15;
        if ((i16 & 32) != 0) {
            label3 = null;
        }
        return bVar.h(label, label2, bVar2, lVar, i17, label3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        return new c.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(vt1.a.D), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.V3, null, C1743b.f76998a, this.labelProvider.c(vt1.a.Q), this.labelProvider.c(vt1.a.M), null, 34, null), e(params), params.getState().getFieldTypeToScroll(), params.e(), new ButtonTextData(null, this.labelProvider.c(vt1.a.P), null, null, params.b(), 13, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(vt1.a.L), null, 2, null), d.a.f107773a, null, params.d(), 35, null));
    }
}
