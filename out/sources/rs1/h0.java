package rs1;

import d60.ScrollControllerData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import t50.TextAreaData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\rB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lrs1/h0;", "Lxw/f;", "Lrs1/h0$b;", "Lrs1/j$a;", "<init>", "()V", "Lhz/b;", "Lt50/e;", "Z", "(Lhz/b;)Lt50/e;", "params", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lrs1/h0$b;)Lrs1/j$a;", "a", "b", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements xw.f<Params, j.Data> {

    /* JADX INFO: renamed from: rs1.h0$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b)\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b*\u0010\"R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b \u0010(¨\u0006+"}, d2 = {"Lrs1/h0$b;", "", "Lrs1/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function2;", "Lrs1/h;", "", "onInputChanged", "Lkotlin/Function1;", "onClearValidation", "onValidateField", "onValidateForm", "Lrs1/g;", "onCharsLimitReached", "<init>", "(Lrs1/i;Ler/a;Ler/p;Ler/l;Ler/l;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrs1/i;", "g", "()Lrs1/i;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/p;", "d", "()Ler/p;", "Ler/l;", "()Ler/l;", "e", "f", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<h, String, oq.i0> onInputChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<h, oq.i0> onClearValidation;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<h, oq.i0> onValidateField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onValidateForm;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<CharsLimitReachedData, oq.i0> onCharsLimitReached;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<oq.i0> aVar, er.p<? super h, ? super String, oq.i0> pVar, er.l<? super h, oq.i0> lVar, er.l<? super h, oq.i0> lVar2, er.a<oq.i0> aVar2, er.l<? super CharsLimitReachedData, oq.i0> lVar3) {
            this.state = state;
            this.onBack = aVar;
            this.onInputChanged = pVar;
            this.onClearValidation = lVar;
            this.onValidateField = lVar2;
            this.onValidateForm = aVar2;
            this.onCharsLimitReached = lVar3;
        }

        public final er.a<oq.i0> a() {
            return this.onBack;
        }

        public final er.l<CharsLimitReachedData, oq.i0> b() {
            return this.onCharsLimitReached;
        }

        public final er.l<h, oq.i0> c() {
            return this.onClearValidation;
        }

        public final er.p<h, String, oq.i0> d() {
            return this.onInputChanged;
        }

        public final er.l<h, oq.i0> e() {
            return this.onValidateField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBack, params.onBack) && fr.t.c(this.onInputChanged, params.onInputChanged) && fr.t.c(this.onClearValidation, params.onClearValidation) && fr.t.c(this.onValidateField, params.onValidateField) && fr.t.c(this.onValidateForm, params.onValidateForm) && fr.t.c(this.onCharsLimitReached, params.onCharsLimitReached);
        }

        public final er.a<oq.i0> f() {
            return this.onValidateForm;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onInputChanged.hashCode()) * 31) + this.onClearValidation.hashCode()) * 31) + this.onValidateField.hashCode()) * 31) + this.onValidateForm.hashCode()) * 31) + this.onCharsLimitReached.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onInputChanged=" + this.onInputChanged + ", onClearValidation=" + this.onClearValidation + ", onValidateField=" + this.onValidateField + ", onValidateForm=" + this.onValidateForm + ", onCharsLimitReached=" + this.onCharsLimitReached + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(Params params, String str) {
        params.d().B(h.EMAIL, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.EMAIL);
        } else {
            params.e().b(h.EMAIL);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(Params params, String str) {
        params.d().B(h.PESEL, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.PESEL);
        } else {
            params.e().b(h.PESEL);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(Params params, String str) {
        params.d().B(h.SEARCH, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.SEARCH);
        } else {
            params.e().b(h.SEARCH);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(Params params, boolean z15) {
        params.b().b(new CharsLimitReachedData(h.DESCRIPTION, z15, 20));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(Params params, String str) {
        params.d().B(h.DESCRIPTION, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.DESCRIPTION);
        } else {
            params.e().b(h.DESCRIPTION);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(Params params, String str) {
        params.d().B(h.PASSWORD, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.PASSWORD);
        } else {
            params.e().b(h.PASSWORD);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(Params params, String str) {
        params.d().B(h.POST_CODE, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.POST_CODE);
        } else {
            params.e().b(h.POST_CODE);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(Params params, String str) {
        params.d().B(h.PHONE_COUNTRY_CODE, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.PHONE_COUNTRY_CODE);
        } else {
            params.e().b(h.PHONE_COUNTRY_CODE);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(Params params, String str) {
        params.d().B(h.PHONE_NUMBER, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(Params params, boolean z15) {
        if (z15) {
            params.c().b(h.PHONE_NUMBER);
        } else {
            params.e().b(h.PHONE_NUMBER);
        }
        return oq.i0.f148189a;
    }

    private final t50.e Z(hz.b bVar) {
        if (fr.t.c(bVar, hz.b.C2039b.f86846c) || fr.t.c(bVar, hz.b.d.f86848c)) {
            return new t50.e.Default(null, 1, null);
        }
        if (bVar instanceof hz.b.Invalid) {
            return new t50.e.Error(((hz.b.Invalid) bVar).getMessage());
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public j.Data b(final Params params) {
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Validators", "ScreenTitle"), null, null, null, 28, null), null, null, null, new ScrollControllerData(params.getState().e(), false, false, 6, null), 29, null);
        er.a<oq.i0> aVarA = params.a();
        Label labelB = mx.b.b("Email validator:\n- live validation\n- trigger validation\n- focus validation", "");
        Label labelB2 = mx.b.b(String.valueOf(fr.q0.c(v50.c.Text.class).D()), "");
        Label labelB3 = mx.b.b("Type email", "");
        State state2 = params.getState();
        h hVar = h.EMAIL;
        v50.c.Text text = new v50.c.Text(null, labelB2, labelB3, mx.b.b(state2.d(hVar), ""), params.getState().c(hVar), null, null, new er.l() { // from class: rs1.q
            @Override // er.l
            public final Object b(Object obj) {
                return h0.I(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.J(params, ((Boolean) obj).booleanValue());
            }
        }, false, 0, null, false, null, false, null, null, null, null, hVar, 523873, null);
        Label labelB4 = mx.b.b("Password validator:\n- trigger validation\n- focus validation", "");
        Label labelB5 = mx.b.b(String.valueOf(fr.q0.c(v50.c.Password.class).D()), "");
        Label labelB6 = mx.b.b("Type password", "");
        State state3 = params.getState();
        h hVar2 = h.PASSWORD;
        v50.c.Password password = new v50.c.Password(null, labelB5, labelB6, mx.b.b(state3.d(hVar2), ""), params.getState().c(hVar2), null, null, new er.l() { // from class: rs1.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.R(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.r
            @Override // er.l
            public final Object b(Object obj) {
                return h0.S(params, ((Boolean) obj).booleanValue());
            }
        }, false, 0, null, false, null, false, 0, null, hVar2, null, null, 917089, null);
        Label labelB7 = mx.b.b("Post code validator:\n- trigger validation\n- focus validation", "");
        Label labelB8 = mx.b.b(String.valueOf(fr.q0.c(v50.c.Masked.class).D()), "");
        Label labelB9 = mx.b.b("Type post code", "");
        State state4 = params.getState();
        h hVar3 = h.POST_CODE;
        v50.c.Masked masked = new v50.c.Masked(null, labelB8, mx.b.b(state4.d(hVar3), ""), labelB9, params.getState().c(hVar3), null, null, new er.l() { // from class: rs1.s
            @Override // er.l
            public final Object b(Object obj) {
                return h0.T(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.t
            @Override // er.l
            public final Object b(Object obj) {
                return h0.U(params, ((Boolean) obj).booleanValue());
            }
        }, false, 0, null, false, null, false, null, null, 0, hVar3, w50.a.POST_CODE, 261729, null);
        Label labelB10 = mx.b.b("Phone number validator:\n- trigger validation\n- focus validation", "");
        Label labelB11 = mx.b.b(String.valueOf(fr.q0.c(v50.c.PhoneNumber.class).D()), "");
        State state5 = params.getState();
        h hVar4 = h.PHONE_COUNTRY_CODE;
        Label labelB12 = mx.b.b(state5.d(hVar4), "");
        State state6 = params.getState();
        h hVar5 = h.PHONE_NUMBER;
        Label labelB13 = mx.b.b(state6.d(hVar5), "");
        v50.c.PhoneNumber phoneNumber = new v50.c.PhoneNumber(null, null, labelB11, 0, null, hVar5, labelB12, 0, params.getState().c(hVar4), new er.l() { // from class: rs1.u
            @Override // er.l
            public final Object b(Object obj) {
                return h0.V(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.v
            @Override // er.l
            public final Object b(Object obj) {
                return h0.W(params, ((Boolean) obj).booleanValue());
            }
        }, labelB13, null, params.getState().c(hVar5), new er.l() { // from class: rs1.w
            @Override // er.l
            public final Object b(Object obj) {
                return h0.X(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.x
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Y(params, ((Boolean) obj).booleanValue());
            }
        }, 4251, null);
        Label labelB14 = mx.b.b("Pesel validator:\n- trigger validation\n- focus validation", "");
        Label labelB15 = mx.b.b(String.valueOf(fr.q0.c(v50.c.Number.class).D()), "");
        Label labelB16 = mx.b.b("Type pesel", "");
        State state7 = params.getState();
        h hVar6 = h.PESEL;
        v50.c.Number number = new v50.c.Number(null, labelB15, labelB16, mx.b.b(state7.d(hVar6), ""), params.getState().c(hVar6), null, null, new er.l() { // from class: rs1.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.K(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.L(params, ((Boolean) obj).booleanValue());
            }
        }, false, 0, null, false, null, false, null, null, null, hVar6, false, 786017, null);
        Label labelB17 = mx.b.b("Search validator:\n- trigger validation\n- focus validation\n- live validation", "");
        Label labelB18 = mx.b.b("Type to search", "");
        State state8 = params.getState();
        h hVar7 = h.SEARCH;
        v50.c.Search search = new v50.c.Search(null, null, labelB18, mx.b.b(state8.d(hVar7), ""), params.getState().c(hVar7), null, null, new er.l() { // from class: rs1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.M(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.N(params, ((Boolean) obj).booleanValue());
            }
        }, false, 0, null, false, null, false, null, null, hVar7, 130659, null);
        Label labelB19 = mx.b.b("Description validator (TextArea):\n- trigger validation\n- focus validation\n- characters counter live validation", "");
        Label labelB20 = mx.b.b("Type to input description", "");
        State state9 = params.getState();
        h hVar8 = h.DESCRIPTION;
        return new j.Data(state, baseScaffoldData, aVarA, labelB, text, labelB4, password, labelB7, masked, labelB10, phoneNumber, labelB14, number, labelB17, search, labelB19, new TextAreaData(null, null, new t50.s.Fix(4), null, Z(params.getState().c(hVar8)), state9.d(hVar8), false, new t50.a.Visible(20, new er.l() { // from class: rs1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.O(params, ((Boolean) obj).booleanValue());
            }
        }), labelB20, 0, null, hVar8, new er.l() { // from class: rs1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.P(params, (String) obj);
            }
        }, new er.l() { // from class: rs1.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Q(params, ((Boolean) obj).booleanValue());
            }
        }, 1611, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Validate", ""), null, 2, null), k30.d.a.f107773a, null, params.f(), 35, null));
    }
}
