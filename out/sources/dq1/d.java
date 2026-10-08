package dq1;

import fr.v0;
import h30.ButtonData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ldq1/d;", "Lxw/f;", "Ldq1/d$a;", "Ldq1/a0$a;", "<init>", "()V", "", "Ldq1/b0;", "Lkotlin/Function1;", "Loq/i0;", "onDeleteFile", "onPreviewFile", "Ln40/i;", "i", "(Ljava/util/List;Ler/l;Ler/l;)Ljava/util/List;", "params", "h", "(Ldq1/d$a;)Ldq1/a0$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, a0.Data> {

    /* JADX INFO: renamed from: dq1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Ldq1/d$a;", "", "Ldq1/z;", "state", "Lkotlin/Function1;", "Ldq1/b0;", "Loq/i0;", "onDeleteFile", "onPreviewFile", "Lkotlin/Function0;", "onNextButtonClicked", "onAddFileClicked", "<init>", "(Ldq1/z;Ler/l;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldq1/z;", "e", "()Ldq1/z;", "b", "Ler/l;", "()Ler/l;", "c", "d", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onDeleteFile;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onPreviewFile;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddFileClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super b0, i0> lVar, er.l<? super b0, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onDeleteFile = lVar;
            this.onPreviewFile = lVar2;
            this.onNextButtonClicked = aVar;
            this.onAddFileClicked = aVar2;
        }

        public final er.a<i0> a() {
            return this.onAddFileClicked;
        }

        public final er.l<b0, i0> b() {
            return this.onDeleteFile;
        }

        public final er.a<i0> c() {
            return this.onNextButtonClicked;
        }

        public final er.l<b0, i0> d() {
            return this.onPreviewFile;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onDeleteFile, params.onDeleteFile) && fr.t.c(this.onPreviewFile, params.onPreviewFile) && fr.t.c(this.onNextButtonClicked, params.onNextButtonClicked) && fr.t.c(this.onAddFileClicked, params.onAddFileClicked);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onDeleteFile.hashCode()) * 31) + this.onPreviewFile.hashCode()) * 31) + this.onNextButtonClicked.hashCode()) * 31) + this.onAddFileClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDeleteFile=" + this.onDeleteFile + ", onPreviewFile=" + this.onPreviewFile + ", onNextButtonClicked=" + this.onNextButtonClicked + ", onAddFileClicked=" + this.onAddFileClicked + ')';
        }
    }

    private final List<n40.i> i(List<? extends b0> list, final er.l<? super b0, i0> lVar, final er.l<? super b0, i0> lVar2) {
        n40.i regular;
        List<? extends b0> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        for (final b0 b0Var : list2) {
            if (b0Var instanceof b0.Image) {
                b0.Image image = (b0.Image) b0Var;
                Label labelB = mx.b.b(image.getName(), "");
                StringBuilder sb5 = new StringBuilder();
                v0 v0Var = v0.f66418a;
                sb5.append(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(image.getSize())}, 1)));
                sb5.append(" MB");
                regular = new n40.i.Image(labelB, mx.b.b(sb5.toString(), ""), new er.a() { // from class: dq1.a
                    @Override // er.a
                    public final Object a() {
                        return d.l(lVar, b0Var);
                    }
                }, new er.a() { // from class: dq1.b
                    @Override // er.a
                    public final Object a() {
                        return d.m(lVar2, b0Var);
                    }
                }, new n40.i.Image.AbstractC3255a.Image(image.getBitmap()));
            } else {
                if (!(b0Var instanceof b0.Regular)) {
                    throw new oq.p();
                }
                b0.Regular regular2 = (b0.Regular) b0Var;
                Label labelB2 = mx.b.b(regular2.getName(), "");
                StringBuilder sb6 = new StringBuilder();
                v0 v0Var2 = v0.f66418a;
                sb6.append(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(regular2.getSize())}, 1)));
                sb6.append(" MB");
                regular = new n40.i.Regular(labelB2, mx.b.b(sb6.toString(), ""), null, new er.a() { // from class: dq1.c
                    @Override // er.a
                    public final Object a() {
                        return d.q(lVar, b0Var);
                    }
                }, 4, null);
            }
            arrayList.add(regular);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.l lVar, b0 b0Var) {
        lVar.b(b0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(er.l lVar, b0 b0Var) {
        lVar.b(b0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(er.l lVar, b0 b0Var) {
        lVar.b(b0Var);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a0.Data b(Params params) {
        Label labelB = mx.b.b("Dodaj plik", "");
        List<n40.i> listI = i(params.getState().c(), params.b(), params.d());
        boolean showError = params.getState().getShowError();
        Boolean boolValueOf = Boolean.valueOf(showError);
        if (!showError) {
            boolValueOf = null;
        }
        Label labelB2 = boolValueOf != null ? mx.b.b("Dodanie pliku jest wymagane", "") : null;
        wx.d.Companion companion = wx.d.INSTANCE;
        return new a0.Data(new FilePickerData(labelB, labelB2, listI, pq.v.q(new n40.e.AllowedFormats(e1.i(wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.K()), wx.d.j0(companion.J()))), new n40.e.b.Total(xw.a.b(9.64E7f), null), new n40.e.SelectionLimit(4)), params.a(), 4), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Uruchom walidację", ""), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
