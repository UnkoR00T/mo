package a22;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.List;
import m02.Field;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import y12.State;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001JB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J=\u0010'\u001a\u00020&2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001b\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(JQ\u0010/\u001a\u00020.2\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001c2\b\b\u0002\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u008d\u0001\u00106\u001a\u00020\u00172\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\t0\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u00103\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u0002042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b6\u00107J\u008d\u0001\u00109\u001a\u00020\u00172\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u00103\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u0002082\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020,*\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010<J\u0085\u0001\u0010=\u001a\u00020\u00172\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u00103\u001a\u0004\u0018\u00010\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b=\u0010>Je\u0010C\u001a\u00020\u00172\u0006\u0010?\u001a\u0002082\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u00103\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bC\u0010DJe\u0010E\u001a\u00020\u00172\u0006\u0010?\u001a\u0002042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u00103\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bE\u0010FJ\u0018\u0010H\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"La22/p;", "Lxw/f;", "La22/p$a;", "Ly12/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "a0", "(Ler/a;)Li50/a;", "searchAction", "Lh30/a;", "b0", "(Ler/a;)Lh30/a;", "Lkotlin/Function1;", "Lf02/a;", "onSelected", "Ly12/b;", "state", "La50/a;", "X", "(Ler/l;Ly12/b;)La50/a;", "Lm02/a;", "fieldType", "Lmx/a;", "Q", "(Ly12/b;Lm02/a;)Lmx/a;", "Lhz/b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ly12/b;Lm02/a;)Lhz/b;", "showCountriesDictionary", "Ly12/c$c;", AnnotatedPrivateKey.LABEL, "placeholder", "Ly12/c$b$a;", "N", "(Ler/a;Ly12/c$c;Lmx/a;Lmx/a;Ly12/b;)Ly12/c$b$a;", "Loq/r;", "", "valueChangedAction", "La22/t;", "textInputType", "Ly12/c$b$b;", "c0", "(Ler/l;Ly12/b;Ly12/c$c;Lmx/a;La22/t;)Ly12/c$b$b;", "focusChangedAction", "onScrollToField", "fieldToScroll", "Lf02/a$b;", "recipientType", "W", "(Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Lm02/a;Lf02/a$b;Ly12/b;)La50/a;", "Lf02/a$a;", "M", "(Ler/l;Ler/l;Ler/l;Ler/a;Lm02/a;Lf02/a$a;Ly12/b;Ler/a;)La50/a;", "i0", "(Ly12/b;)La22/t;", "g0", "(Ler/l;Ler/l;Ly12/b;Ler/l;Ler/a;Lm02/a;Ler/a;)La50/a;", "recipient", "", "Ly12/c$b;", "inputs", "F", "(Lf02/a$a;Ler/l;Ljava/util/List;Ler/l;Ler/a;Lm02/a;)La50/a;", "R", "(Lf02/a$b;Ler/l;Ljava/util/List;Ler/l;Ler/a;Lm02/a;)La50/a;", "params", "h0", "(La22/p$a;)Ly12/c$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements xw.f<Params, y12.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: a22.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b(\u0010#R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b!\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010#¨\u0006+"}, d2 = {"La22/p$a;", "", "Ly12/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function1;", "Lf02/a;", "searchConditionSelected", "Loq/r;", "Lm02/a;", "", "valueChangedAction", "searchAction", "focusChangedAction", "onScrollToField", "showCountriesDictionary", "<init>", "(Ly12/b;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly12/b;", "g", "()Ly12/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "d", "h", "f", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<f02.a, i0> searchConditionSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<oq.r<? extends m02.a, String>, i0> valueChangedAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> searchAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<m02.a, i0> focusChangedAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrollToField;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showCountriesDictionary;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.l<? super f02.a, i0> lVar, er.l<? super oq.r<? extends m02.a, String>, i0> lVar2, er.a<i0> aVar2, er.l<? super m02.a, i0> lVar3, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.closeAction = aVar;
            this.searchConditionSelected = lVar;
            this.valueChangedAction = lVar2;
            this.searchAction = aVar2;
            this.focusChangedAction = lVar3;
            this.onScrollToField = aVar3;
            this.showCountriesDictionary = aVar4;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.l<m02.a, i0> b() {
            return this.focusChangedAction;
        }

        public final er.a<i0> c() {
            return this.onScrollToField;
        }

        public final er.a<i0> d() {
            return this.searchAction;
        }

        public final er.l<f02.a, i0> e() {
            return this.searchConditionSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.closeAction, params.closeAction) && fr.t.c(this.searchConditionSelected, params.searchConditionSelected) && fr.t.c(this.valueChangedAction, params.valueChangedAction) && fr.t.c(this.searchAction, params.searchAction) && fr.t.c(this.focusChangedAction, params.focusChangedAction) && fr.t.c(this.onScrollToField, params.onScrollToField) && fr.t.c(this.showCountriesDictionary, params.showCountriesDictionary);
        }

        public final er.a<i0> f() {
            return this.showCountriesDictionary;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.l<oq.r<? extends m02.a, String>, i0> h() {
            return this.valueChangedAction;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.searchConditionSelected.hashCode()) * 31) + this.valueChangedAction.hashCode()) * 31) + this.searchAction.hashCode()) * 31) + this.focusChangedAction.hashCode()) * 31) + this.onScrollToField.hashCode()) * 31) + this.showCountriesDictionary.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", searchConditionSelected=" + this.searchConditionSelected + ", valueChangedAction=" + this.valueChangedAction + ", searchAction=" + this.searchAction + ", focusChangedAction=" + this.focusChangedAction + ", onScrollToField=" + this.onScrollToField + ", showCountriesDictionary=" + this.showCountriesDictionary + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2152a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2152a = iArr;
        }
    }

    public p(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final RadioButtonData F(f02.a.AbstractC1288a recipient, final er.l<? super f02.a, i0> onSelected, List<? extends y12.c.b> inputs, final er.l<? super m02.a, i0> focusChangedAction, er.a<i0> onScrollToField, m02.a fieldToScroll) {
        Label labelC = this.labelProvider.c(e02.a.G1);
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, fr.t.c(recipient, f02.a.AbstractC1288a.b.f54575a), false, 5, null);
        RadioButtonRow radioButtonRow = new RadioButtonRow(radioButtonItemData, new er.a() { // from class: a22.n
            @Override // er.a
            public final Object a() {
                return p.H(onSelected);
            }
        }, this.labelProvider.c(e02.a.E1), null, new z12.c(inputs, new er.p() { // from class: a22.m
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.G(focusChangedAction, (y12.c.InterfaceC5962c) obj, ((Boolean) obj2).booleanValue());
            }
        }, fieldToScroll != null ? q.b(fieldToScroll) : null, onScrollToField), 8, null);
        RadioButtonItemData radioButtonItemData2 = new RadioButtonItemData(false, fr.t.c(recipient, f02.a.AbstractC1288a.c.f54576a), false, 5, null);
        return new RadioButtonData(v.q(radioButtonRow, new RadioButtonRow(radioButtonItemData2, new er.a() { // from class: a22.b
            @Override // er.a
            public final Object a() {
                return p.J(onSelected);
            }
        }, this.labelProvider.c(e02.a.F1), null, new z12.c(inputs, new er.p() { // from class: a22.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.I(focusChangedAction, (y12.c.InterfaceC5962c) obj, ((Boolean) obj2).booleanValue());
            }
        }, fieldToScroll != null ? q.b(fieldToScroll) : null, onScrollToField), 8, null), new RadioButtonRow(new RadioButtonItemData(false, fr.t.c(recipient, f02.a.AbstractC1288a.C1289a.f54574a), false, 5, null), new er.a() { // from class: a22.d
            @Override // er.a
            public final Object a() {
                return p.L(onSelected);
            }
        }, this.labelProvider.c(e02.a.D1), null, new z12.c(inputs, new er.p() { // from class: a22.c
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.K(focusChangedAction, (y12.c.InterfaceC5962c) obj, ((Boolean) obj2).booleanValue());
            }
        }, fieldToScroll != null ? q.b(fieldToScroll) : null, onScrollToField), 8, null)), b50.e.a.f16684a, null, labelC, null, null, null, 116, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(er.l lVar, y12.c.InterfaceC5962c interfaceC5962c, boolean z15) {
        if (!z15) {
            lVar.b(q.a(interfaceC5962c));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(er.l lVar) {
        lVar.b(f02.a.AbstractC1288a.b.f54575a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(er.l lVar, y12.c.InterfaceC5962c interfaceC5962c, boolean z15) {
        if (!z15) {
            lVar.b(q.a(interfaceC5962c));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(er.l lVar) {
        lVar.b(f02.a.AbstractC1288a.c.f54576a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(er.l lVar, y12.c.InterfaceC5962c interfaceC5962c, boolean z15) {
        if (!z15) {
            lVar.b(q.a(interfaceC5962c));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(er.l lVar) {
        lVar.b(f02.a.AbstractC1288a.C1289a.f54574a);
        return i0.f148189a;
    }

    private final RadioButtonData M(er.l<? super oq.r<? extends m02.a, String>, i0> valueChangedAction, er.l<? super f02.a, i0> onSelected, er.l<? super m02.a, i0> focusChangedAction, er.a<i0> onScrollToField, m02.a fieldToScroll, f02.a.AbstractC1288a recipientType, State state, er.a<i0> showCountriesDictionary) {
        if (fr.t.c(recipientType, f02.a.AbstractC1288a.b.f54575a)) {
            Label labelC = this.labelProvider.c(e02.a.Y);
            y12.c.InterfaceC5962c.b bVar = y12.c.InterfaceC5962c.b.NIP;
            t tVar = t.NUMBER;
            return F(recipientType, onSelected, v.q(c0(valueChangedAction, state, bVar, labelC, tVar), c0(valueChangedAction, state, y12.c.InterfaceC5962c.b.REGON, this.labelProvider.c(e02.a.f46551j0), tVar)), focusChangedAction, onScrollToField, fieldToScroll);
        }
        if (fr.t.c(recipientType, f02.a.AbstractC1288a.C1289a.f54574a)) {
            return F(recipientType, onSelected, v.q(d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.NAME, this.labelProvider.c(e02.a.M), null, 16, null), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.SURNAME, this.labelProvider.c(e02.a.V), null, 16, null), N(showCountriesDictionary, y12.c.InterfaceC5962c.a.COUNTRY, this.labelProvider.c(e02.a.f46580o), this.labelProvider.c(e02.a.f46538h), state), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.CITY, this.labelProvider.c(e02.a.f46544i), null, 16, null), c0(valueChangedAction, state, y12.c.InterfaceC5962c.a.POSTCODE, this.labelProvider.c(e02.a.f46533g0), i0(state)), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.STREET, this.labelProvider.c(e02.a.f46635x0), null, 16, null), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.BUILDING_NUMBER, this.labelProvider.c(e02.a.f46526f), null, 16, null), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.APARTMENT_NUMBER, this.labelProvider.c(e02.a.f46514d), null, 16, null)), focusChangedAction, onScrollToField, fieldToScroll);
        }
        if (fr.t.c(recipientType, f02.a.AbstractC1288a.c.f54576a)) {
            return F(recipientType, onSelected, v.q(d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.EnumC5963c.NAME, this.labelProvider.c(e02.a.M), null, 16, null), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.EnumC5963c.SURNAME, this.labelProvider.c(e02.a.V), null, 16, null)), focusChangedAction, onScrollToField, fieldToScroll);
        }
        throw new oq.p();
    }

    private final y12.c.b.DropDownButton N(final er.a<i0> showCountriesDictionary, y12.c.InterfaceC5962c fieldType, Label label, Label placeholder, State state) {
        j40.m enabled;
        hz.b bVarP = P(state, q.a(fieldType));
        Integer num = null;
        if (bVarP instanceof hz.b.Invalid) {
            enabled = new j40.m.Error(((hz.b.Invalid) bVarP).getMessage());
        } else {
            if (!fr.t.c(bVarP, hz.b.d.f86848c) && !fr.t.c(bVarP, hz.b.C2039b.f86846c)) {
                throw new oq.p();
            }
            enabled = new j40.m.Enabled(null, 1, null);
        }
        j40.m mVar = enabled;
        List listE = v.e(Q(state, q.a(fieldType)));
        Field<String> field = state.getFields().a().get(m02.a.EnumC2987a.COUNTRY);
        if (field != null && field.d() != null) {
            num = 0;
        }
        return new y12.c.b.DropDownButton(fieldType, new DropDownButtonData(label, listE, num, mVar, placeholder, false, null, new er.l() { // from class: a22.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.O(showCountriesDictionary, (DropDownButtonData) obj);
            }
        }, 96, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(er.a aVar, DropDownButtonData dropDownButtonData) {
        aVar.a();
        return i0.f148189a;
    }

    private final hz.b P(State state, m02.a fieldType) {
        hz.b state2;
        Field<String> field = state.getFields().a().get(fieldType);
        return (field == null || (state2 = field.getState()) == null) ? hz.b.C2039b.f86846c : state2;
    }

    private final Label Q(State state, m02.a fieldType) {
        String strD;
        Label labelB;
        Field<String> field = state.getFields().a().get(fieldType);
        return (field == null || (strD = field.d()) == null || (labelB = mx.b.b(strD, String.valueOf(fieldType))) == null) ? new Label("", String.valueOf(fieldType)) : labelB;
    }

    private final RadioButtonData R(f02.a.b recipient, final er.l<? super f02.a, i0> onSelected, List<? extends y12.c.b> inputs, final er.l<? super m02.a, i0> focusChangedAction, er.a<i0> onScrollToField, m02.a fieldToScroll) {
        Label labelC = this.labelProvider.c(e02.a.G1);
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, fr.t.c(recipient, f02.a.b.C1291b.f54578a), false, 5, null);
        return new RadioButtonData(v.q(new RadioButtonRow(radioButtonItemData, new er.a() { // from class: a22.g
            @Override // er.a
            public final Object a() {
                return p.T(onSelected);
            }
        }, this.labelProvider.c(e02.a.E1), null, new z12.c(inputs, new er.p() { // from class: a22.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.S(focusChangedAction, (y12.c.InterfaceC5962c) obj, ((Boolean) obj2).booleanValue());
            }
        }, fieldToScroll != null ? q.b(fieldToScroll) : null, onScrollToField), 8, null), new RadioButtonRow(new RadioButtonItemData(false, fr.t.c(recipient, f02.a.b.C1290a.f54577a), false, 5, null), new er.a() { // from class: a22.i
            @Override // er.a
            public final Object a() {
                return p.V(onSelected);
            }
        }, this.labelProvider.c(e02.a.D1), null, new z12.c(inputs, new er.p() { // from class: a22.h
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.U(focusChangedAction, (y12.c.InterfaceC5962c) obj, ((Boolean) obj2).booleanValue());
            }
        }, fieldToScroll != null ? q.b(fieldToScroll) : null, onScrollToField), 8, null)), b50.e.a.f16684a, null, labelC, null, null, null, 116, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(er.l lVar, y12.c.InterfaceC5962c interfaceC5962c, boolean z15) {
        if (!z15) {
            lVar.b(q.a(interfaceC5962c));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(er.l lVar) {
        lVar.b(f02.a.b.C1291b.f54578a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(er.l lVar, y12.c.InterfaceC5962c interfaceC5962c, boolean z15) {
        if (!z15) {
            lVar.b(q.a(interfaceC5962c));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(er.l lVar) {
        lVar.b(f02.a.b.C1290a.f54577a);
        return i0.f148189a;
    }

    private final RadioButtonData W(er.l<? super oq.r<? extends m02.a, String>, i0> valueChangedAction, er.a<i0> showCountriesDictionary, er.l<? super f02.a, i0> onSelected, er.l<? super m02.a, i0> focusChangedAction, er.a<i0> onScrollToField, m02.a fieldToScroll, f02.a.b recipientType, State state) {
        if (!fr.t.c(recipientType, f02.a.b.C1291b.f54578a)) {
            if (fr.t.c(recipientType, f02.a.b.C1290a.f54577a)) {
                return R(recipientType, onSelected, v.q(d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.PUBLIC_NAME, this.labelProvider.c(e02.a.I1), null, 16, null), N(showCountriesDictionary, y12.c.InterfaceC5962c.a.COUNTRY, this.labelProvider.c(e02.a.f46580o), this.labelProvider.c(e02.a.f46538h), state), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.CITY, this.labelProvider.c(e02.a.f46544i), null, 16, null), c0(valueChangedAction, state, y12.c.InterfaceC5962c.a.POSTCODE, this.labelProvider.c(e02.a.f46533g0), i0(state)), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.STREET, this.labelProvider.c(e02.a.f46635x0), null, 16, null), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.BUILDING_NUMBER, this.labelProvider.c(e02.a.f46526f), null, 16, null), d0(this, valueChangedAction, state, y12.c.InterfaceC5962c.a.APARTMENT_NUMBER, this.labelProvider.c(e02.a.f46514d), null, 16, null)), focusChangedAction, onScrollToField, fieldToScroll);
            }
            throw new oq.p();
        }
        Label labelC = this.labelProvider.c(e02.a.f46509c0);
        y12.c.InterfaceC5962c.b bVar = y12.c.InterfaceC5962c.b.PESEL;
        t tVar = t.NUMBER;
        return R(recipientType, onSelected, v.q(c0(valueChangedAction, state, bVar, labelC, tVar), c0(valueChangedAction, state, y12.c.InterfaceC5962c.b.NIP, this.labelProvider.c(e02.a.Y), tVar), c0(valueChangedAction, state, y12.c.InterfaceC5962c.b.REGON, this.labelProvider.c(e02.a.f46551j0), tVar), c0(valueChangedAction, state, y12.c.InterfaceC5962c.b.KRS, this.labelProvider.c(e02.a.U), tVar), c0(valueChangedAction, state, y12.c.InterfaceC5962c.b.EUROPEAN_ID, this.labelProvider.c(e02.a.C), t.TEXT)), focusChangedAction, onScrollToField, fieldToScroll);
    }

    private final RadioButtonData X(final er.l<? super f02.a, i0> onSelected, State state) {
        return new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, state.getSearchCondition() instanceof f02.a.b, false, 5, null), new er.a() { // from class: a22.e
            @Override // er.a
            public final Object a() {
                return p.Y(onSelected);
            }
        }, this.labelProvider.c(e02.a.L1), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, state.getSearchCondition() instanceof f02.a.AbstractC1288a, false, 5, null), new er.a() { // from class: a22.f
            @Override // er.a
            public final Object a() {
                return p.Z(onSelected);
            }
        }, this.labelProvider.c(e02.a.K1), null, null, 24, null)), b50.e.a.f16684a, null, this.labelProvider.c(e02.a.M1), null, null, null, 116, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(er.l lVar) {
        lVar.b(f02.a.b.C1291b.f54578a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(er.l lVar) {
        lVar.b(f02.a.AbstractC1288a.b.f54575a);
        return i0.f148189a;
    }

    private final BaseScaffoldData a0(er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), this.labelProvider.c(e02.a.f46600r1), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final ButtonData b0(er.a<i0> searchAction) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.f46575n0), null, 2, null), k30.d.a.f107773a, null, searchAction, 35, null);
    }

    private final y12.c.b.TextInput c0(final er.l<? super oq.r<? extends m02.a, String>, i0> valueChangedAction, State state, final y12.c.InterfaceC5962c fieldType, Label label, t textInputType) {
        v50.c text;
        int i15 = b.f2152a[textInputType.ordinal()];
        if (i15 == 1) {
            text = new v50.c.Text(null, label, null, Q(state, q.a(fieldType)), P(state, q.a(fieldType)), null, null, new er.l() { // from class: a22.j
                @Override // er.l
                public final Object b(Object obj) {
                    return p.e0(valueChangedAction, fieldType, (String) obj);
                }
            }, null, false, 0, null, false, null, true, null, null, null, null, null, 1032037, null);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            text = new v50.c.Number(null, label, null, Q(state, q.a(fieldType)), P(state, q.a(fieldType)), null, null, new er.l() { // from class: a22.k
                @Override // er.l
                public final Object b(Object obj) {
                    return p.f0(valueChangedAction, fieldType, (String) obj);
                }
            }, null, false, 0, null, false, null, false, null, null, null, null, false, 1048421, null);
        }
        return new y12.c.b.TextInput(fieldType, text);
    }

    static /* synthetic */ y12.c.b.TextInput d0(p pVar, er.l lVar, State state, y12.c.InterfaceC5962c interfaceC5962c, Label label, t tVar, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            tVar = t.TEXT;
        }
        return pVar.c0(lVar, state, interfaceC5962c, label, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(er.l lVar, y12.c.InterfaceC5962c interfaceC5962c, String str) {
        lVar.b(new oq.r(q.a(interfaceC5962c), str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(er.l lVar, y12.c.InterfaceC5962c interfaceC5962c, String str) {
        lVar.b(new oq.r(q.a(interfaceC5962c), str));
        return i0.f148189a;
    }

    private final RadioButtonData g0(er.l<? super oq.r<? extends m02.a, String>, i0> valueChangedAction, er.l<? super f02.a, i0> onSelected, State state, er.l<? super m02.a, i0> focusChangedAction, er.a<i0> onScrollToField, m02.a fieldToScroll, er.a<i0> showCountriesDictionary) {
        f02.a searchCondition = state.getSearchCondition();
        if (searchCondition instanceof f02.a.AbstractC1288a) {
            return M(valueChangedAction, onSelected, focusChangedAction, onScrollToField, fieldToScroll, (f02.a.AbstractC1288a) searchCondition, state, showCountriesDictionary);
        }
        if (searchCondition instanceof f02.a.b) {
            return W(valueChangedAction, showCountriesDictionary, onSelected, focusChangedAction, onScrollToField, fieldToScroll, (f02.a.b) searchCondition, state);
        }
        throw new oq.p();
    }

    private final t i0(State state) {
        return j0(state) ? t.NUMBER : t.TEXT;
    }

    private static final boolean j0(State state) {
        Field<String> field = state.getFields().a().get(m02.a.EnumC2987a.COUNTRY);
        return fr.t.c(field != null ? field.d() : null, "POLSKA");
    }

    @Override // er.l
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public y12.c.Data b(Params params) {
        er.a<i0> aVarA = params.a();
        return new y12.c.Data(a0(params.a()), this.labelProvider.c(e02.a.f46618u1), this.labelProvider.c(e02.a.f46612t1), X(params.e(), params.getState()), g0(params.h(), params.e(), params.getState(), params.b(), params.c(), params.getState().getFieldTypeToScroll(), params.f()), aVarA, b0(params.d()), null, 128, null);
    }
}
