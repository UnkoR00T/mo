package iq1;

import fz.FormattedRangeDate;
import java.time.LocalDate;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u0015*\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0015*\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Liq1/i;", "Lxw/f;", "Liq1/i$a;", "Liq1/a0$a;", "Lez/e;", "dateFormatter", "<init>", "(Lez/e;)V", "params", "N", "(Liq1/i$a;)Liq1/a0$a;", "a", "Lez/e;", "getDateFormatter", "()Lez/e;", "", "Liq1/a0$a$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Liq1/i$a;)Ljava/util/List;", "enabledPlaceholders", "Ljava/time/LocalDate;", "", "M", "(Ljava/time/LocalDate;)Ljava/lang/String;", "formatted", "Lfz/e$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lfz/e$a;)Ljava/lang/String;", "I", "enabledSelected", "J", "errorPlaceholders", "K", "errorSelected", "G", "()Ljava/util/List;", "disabled", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, a0.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: iq1.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Liq1/i$a;", "", "Liq1/z;", "state", "Lkotlin/Function1;", "Liq1/c0;", "Loq/i0;", "onFieldClick", "Lkotlin/Function0;", "onCloseClick", "<init>", "(Liq1/z;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liq1/z;", "c", "()Liq1/z;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<c0, i0> onFieldClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super c0, i0> lVar, er.a<i0> aVar) {
            this.state = state;
            this.onFieldClick = lVar;
            this.onCloseClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        public final er.l<c0, i0> b() {
            return this.onFieldClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onFieldClick, params.onFieldClick) && fr.t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onFieldClick.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFieldClick=" + this.onFieldClick + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public i(ez.e eVar) {
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params) {
        params.b().b(c0.b.ERROR_SELECTED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params) {
        params.b().b(c0.a.ERROR_SELECTED);
        return i0.f148189a;
    }

    private final List<a0.Data.Field> G() {
        Label labelB = mx.b.b("Input single date - disabled, placeholder", "");
        InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
        return pq.v.q(new a0.Data.Field(labelB, w40.g.g(c5303a)), new a0.Data.Field(mx.b.b("Input range date - disabled, placeholder", ""), w40.g.g(new InputDateTimeData.b.DateRange(null, 1, null))), new a0.Data.Field(mx.b.b("Input single date - disabled, selected date", ""), w40.g.i(c5303a)), new a0.Data.Field(mx.b.b("Input range date - disabled, selected date", ""), w40.g.i(new InputDateTimeData.b.DateRange(null, 1, null))));
    }

    private final List<a0.Data.Field> H(final Params params) {
        return pq.v.q(new a0.Data.Field(mx.b.b("Input single date - enabled, placeholder", ""), InputDateTimeData.b(w40.g.k(InputDateTimeData.b.C5303a.f203783c), null, null, M(params.getState().getSingleEnabledPlaceholder().getDate()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.g
            @Override // er.a
            public final Object a() {
                return i.r(params);
            }
        }, 1019, null)), new a0.Data.Field(mx.b.b("Input range date - enabled, placeholder", ""), InputDateTimeData.b(w40.g.k(new InputDateTimeData.b.DateRange(null, 1, null)), null, null, L(params.getState().getRangeEnabledPlaceholder().getRange()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.h
            @Override // er.a
            public final Object a() {
                return i.s(params);
            }
        }, 1019, null)));
    }

    private final List<a0.Data.Field> I(final Params params) {
        return pq.v.q(new a0.Data.Field(mx.b.b("Input single date - enabled, selected date", ""), InputDateTimeData.b(w40.g.m(InputDateTimeData.b.C5303a.f203783c), null, null, M(params.getState().getSingleEnabledSelected().getDate()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.c
            @Override // er.a
            public final Object a() {
                return i.u(params);
            }
        }, 1019, null)), new a0.Data.Field(mx.b.b("Input range date - enabled, selected date", ""), InputDateTimeData.b(w40.g.m(new InputDateTimeData.b.DateRange(null, 1, null)), null, null, L(params.getState().getRangeEnabledSelected().getRange()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.d
            @Override // er.a
            public final Object a() {
                return i.v(params);
            }
        }, 1019, null)));
    }

    private final List<a0.Data.Field> J(final Params params) {
        return pq.v.q(new a0.Data.Field(mx.b.b("Input single date - error, placeholder", ""), InputDateTimeData.b(w40.g.o(InputDateTimeData.b.C5303a.f203783c), null, null, M(params.getState().getSingleErrorPlaceholder().getDate()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.e
            @Override // er.a
            public final Object a() {
                return i.x(params);
            }
        }, 1019, null)), new a0.Data.Field(mx.b.b("Input range date - error, placeholder", ""), InputDateTimeData.b(w40.g.o(new InputDateTimeData.b.DateRange(null, 1, null)), null, null, L(params.getState().getRangeErrorPlaceholder().getRange()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.f
            @Override // er.a
            public final Object a() {
                return i.z(params);
            }
        }, 1019, null)));
    }

    private final List<a0.Data.Field> K(final Params params) {
        return pq.v.q(new a0.Data.Field(mx.b.b("Input single date - error, selected date", ""), InputDateTimeData.b(w40.g.q(InputDateTimeData.b.C5303a.f203783c), null, null, M(params.getState().getSingleErrorSelected().getDate()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.a
            @Override // er.a
            public final Object a() {
                return i.E(params);
            }
        }, 1019, null)), new a0.Data.Field(mx.b.b("Input range date - error, selected date", ""), InputDateTimeData.b(w40.g.q(new InputDateTimeData.b.DateRange(null, 1, null)), null, null, L(params.getState().getRangeErrorSelected().getRange()), null, null, null, null, null, false, null, new er.a() { // from class: iq1.b
            @Override // er.a
            public final Object a() {
                return i.F(params);
            }
        }, 1019, null)));
    }

    private final String L(fz.e.LocalDate localDate) {
        FormattedRangeDate formattedRangeDateA;
        String strB = null;
        if (localDate != null && (formattedRangeDateA = this.dateFormatter.a(localDate)) != null) {
            strB = FormattedRangeDate.b(formattedRangeDateA, null, 1, null);
        }
        return strB == null ? "" : strB;
    }

    private final String M(LocalDate localDate) {
        String strD = localDate != null ? this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED) : null;
        return strD == null ? "" : strD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.b().b(c0.b.ENABLED_PLACEHOLDER);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.b().b(c0.a.ENABLED_PLACEHOLDER);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.b().b(c0.b.ENABLED_SELECTED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.b().b(c0.a.ENABLED_SELECTED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.b().b(c0.b.ERROR_PLACEHOLDER);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params) {
        params.b().b(c0.a.ERROR_PLACEHOLDER);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public a0.Data b(Params params) {
        return new a0.Data(pq.v.L0(pq.v.L0(pq.v.L0(pq.v.L0(H(params), I(params)), J(params)), K(params)), G()), params.a());
    }
}
