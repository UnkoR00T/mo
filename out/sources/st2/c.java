package st2;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import er.l;
import ez.e;
import ez.h;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import k30.d;
import l60.KeyValueData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lst2/c;", "Lxw/f;", "Lst2/c$a;", "Lqt2/c$a;", "Lmx/c;", "labelProvider", "Lez/h;", "timeProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/h;Lez/e;)V", "Lqt2/b$b;", "Ll60/c;", "i", "(Lqt2/b$b;)Ll60/c;", "Ljava/time/LocalDate;", "", "f", "(Ljava/time/LocalDate;)Ljava/lang/String;", "Ljava/time/OffsetTime;", "h", "(Ljava/time/OffsetTime;)Ljava/lang/String;", "params", "l", "(Lst2/c$a;)Lqt2/c$a;", "a", "Lmx/c;", "b", "Lez/h;", "c", "Lez/e;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, qt2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: st2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006%"}, d2 = {"Lst2/c$a;", "", "Lqt2/b;", "state", "Lkotlin/Function1;", "Ltt2/b;", "Loq/i0;", "onRadioButtonClick", "Lkotlin/Function0;", "onDatePickerClick", "onTimePickerClick", "onUnrestrictButtonClick", "closeAction", "<init>", "(Lqt2/b;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqt2/b;", "f", "()Lqt2/b;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "d", "e", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final qt2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<tt2.b, i0> onRadioButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDatePickerClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTimePickerClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUnrestrictButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(qt2.b bVar, l<? super tt2.b, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onRadioButtonClick = lVar;
            this.onDatePickerClick = aVar;
            this.onTimePickerClick = aVar2;
            this.onUnrestrictButtonClick = aVar3;
            this.closeAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.onDatePickerClick;
        }

        public final l<tt2.b, i0> c() {
            return this.onRadioButtonClick;
        }

        public final er.a<i0> d() {
            return this.onTimePickerClick;
        }

        public final er.a<i0> e() {
            return this.onUnrestrictButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onRadioButtonClick, params.onRadioButtonClick) && t.c(this.onDatePickerClick, params.onDatePickerClick) && t.c(this.onTimePickerClick, params.onTimePickerClick) && t.c(this.onUnrestrictButtonClick, params.onUnrestrictButtonClick) && t.c(this.closeAction, params.closeAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final qt2.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onRadioButtonClick.hashCode()) * 31) + this.onDatePickerClick.hashCode()) * 31) + this.onTimePickerClick.hashCode()) * 31) + this.onUnrestrictButtonClick.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onRadioButtonClick=" + this.onRadioButtonClick + ", onDatePickerClick=" + this.onDatePickerClick + ", onTimePickerClick=" + this.onTimePickerClick + ", onUnrestrictButtonClick=" + this.onUnrestrictButtonClick + ", closeAction=" + this.closeAction + ')';
        }
    }

    public c(mx.c cVar, h hVar, e eVar) {
        this.labelProvider = cVar;
        this.timeProvider = hVar;
        this.dateFormatter = eVar;
    }

    private final String f(LocalDate localDate) {
        return this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED);
    }

    private final String h(OffsetTime offsetTime) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(offsetTime.atDate(LocalDate.now())), fz.c.ONLY_HOUR);
    }

    private final KeyValueData i(qt2.b.Initialized initialized) {
        mx.c cVar = this.labelProvider;
        int i15 = rs2.a.f175908l;
        e eVar = this.dateFormatter;
        h hVar = this.timeProvider;
        LocalDateTime localDateTime = initialized.getSelectedDate().atTime(initialized.getSelectedTime()).toLocalDateTime();
        fz.f fVar = fz.f.POLISH;
        KeyValueData keyValueData = new KeyValueData(cVar.e(i15, eVar.d(new fz.b.LocalDateTime(hVar.d(localDateTime, fVar)), fz.c.DOTTED_PLUS_HOUR)), this.labelProvider.c(rs2.a.f175919q0), false, 4, null);
        if (this.timeProvider.a(fVar)) {
            return null;
        }
        return keyValueData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.c().b(tt2.b.a.f192302a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.c().b(tt2.b.C5020b.f192303a);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public qt2.c.a b(final Params params) {
        k30.b bVar;
        qt2.b state = params.getState();
        if (t.c(state, qt2.b.a.f168541a)) {
            return qt2.c.a.C4265a.f168548a;
        }
        if (!(state instanceof qt2.b.Initialized)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(rs2.a.f175929v0);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        d.a aVar = d.a.f107773a;
        k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(rs2.a.f175925t0), null, 2, null);
        tt2.b selectedRadioButtonId = ((qt2.b.Initialized) params.getState()).getSelectedRadioButtonId();
        tt2.b.a aVar2 = tt2.b.a.f192302a;
        if (t.c(selectedRadioButtonId, aVar2)) {
            bVar = k30.b.c.f107768a;
        } else {
            hz.b selectedTimeValidationState = ((qt2.b.Initialized) params.getState()).getSelectedTimeValidationState();
            hz.b.d dVar = hz.b.d.f86848c;
            if (t.c(selectedTimeValidationState, dVar) && t.c(((qt2.b.Initialized) params.getState()).getSelectedDateValidationState(), dVar)) {
                bVar = k30.b.c.f107768a;
            } else {
                bVar = k30.b.C2562b.f107767a;
            }
        }
        ButtonData buttonData = new ButtonData(null, null, large, withText, aVar, bVar, params.e(), 3, null);
        tt2.b selectedRadioButtonId2 = ((qt2.b.Initialized) params.getState()).getSelectedRadioButtonId();
        l<tt2.b, i0> lVarC = params.c();
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, t.c(((qt2.b.Initialized) params.getState()).getSelectedRadioButtonId(), aVar2), false, 5, null);
        Label labelC2 = this.labelProvider.c(rs2.a.f175931w0);
        return new qt2.c.a.Initialized(labelC, buttonData, selectedRadioButtonId2, new RadioButtonData(v.q(new RadioButtonRow(radioButtonItemData, new er.a() { // from class: st2.a
            @Override // er.a
            public final Object a() {
                return c.m(params);
            }
        }, this.labelProvider.c(rs2.a.f175933x0), labelC2, null, 16, null), new RadioButtonRow(new RadioButtonItemData(false, t.c(((qt2.b.Initialized) params.getState()).getSelectedRadioButtonId(), tt2.b.C5020b.f192303a), false, 5, null), new er.a() { // from class: st2.b
            @Override // er.a
            public final Object a() {
                return c.q(params);
            }
        }, this.labelProvider.c(rs2.a.f175923s0), this.labelProvider.c(rs2.a.f175921r0), new rt2.b(new InputDateTimeData(null, this.labelProvider.c(rs2.a.f175894e), f(((qt2.b.Initialized) params.getState()).getSelectedDate()), InputDateTimeData.b.C5303a.f203783c, ((qt2.b.Initialized) params.getState()).getSelectedDateValidationState(), null, null, null, false, null, params.b(), 993, null), new InputDateTimeData(null, this.labelProvider.c(rs2.a.f175900h), h(((qt2.b.Initialized) params.getState()).getSelectedTime()), InputDateTimeData.b.c.f203785c, ((qt2.b.Initialized) params.getState()).getSelectedTimeValidationState(), null, null, null, false, null, params.d(), 993, null), i((qt2.b.Initialized) params.getState())))), b50.e.a.f16684a, null, null, null, null, null, 124, null), lVarC, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(rs2.a.A0), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
