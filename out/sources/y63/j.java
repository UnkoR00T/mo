package y63;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ly63/j;", "Ll00/e;", "Ly63/j$a;", "Li70/n;", "a", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ly63/j$a;", "", "a", "c", "b", "Ly63/j$a$a;", "Ly63/j$a$b;", "Ly63/j$a$c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: y63.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly63/j$a$a;", "Ly63/j$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C6024a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6024a f224788a = new C6024a();

            private C6024a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C6024a);
            }

            public int hashCode() {
                return -892197405;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: y63.j$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b \u0010$¨\u0006%"}, d2 = {"Ly63/j$a$b;", "Ly63/j$a;", "Li50/a;", "scaffoldData", "Lo40/a;", "headerData", "", "Ln50/k;", "cards", "Lkotlin/Function0;", "Loq/i0;", "onSnackBarHidden", "<init>", "(Li50/a;Lo40/a;Ljava/util/List;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lo40/a;", "()Lo40/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ler/a;", "()Ler/a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> cards;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onSnackBarHidden;

            /* JADX INFO: renamed from: y63.j$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000e\u0010B'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Ly63/j$a$b$a;", "", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;Ler/a;)V", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "getDescription", "c", "Ler/a;", "getOnClick", "()Ler/a;", "Ln50/k;", "()Ln50/k;", "cardData", "Ly63/j$a$b$a$a;", "Ly63/j$a$b$a$b;", "Ly63/j$a$b$a$c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static abstract class AbstractC6025a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Label description;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                private final er.a<oq.i0> onClick;

                /* JADX INFO: renamed from: y63.j$a$b$a$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Ly63/j$a$b$a$a;", "Ly63/j$a$b$a;", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lmx/a;", "()Lmx/a;", "e", "b", "f", "Ler/a;", "c", "()Ler/a;", "Ln50/k;", "a", "()Ln50/k;", "cardData", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Add extends AbstractC6025a {

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label title;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label description;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                    private final er.a<oq.i0> onClick;

                    public Add(Label label, Label label2, er.a<oq.i0> aVar) {
                        super(label, label2, aVar, null);
                        this.title = label;
                        this.description = label2;
                        this.onClick = aVar;
                    }

                    @Override // y63.j.a.Initialized.AbstractC6025a
                    public n50.k a() {
                        return new DefaultSingleCardData(null, c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(getTitle(), null, null, 0, 0, null, 62, null)), new SingleCardLabel(getDescription(), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public Label getDescription() {
                        return this.description;
                    }

                    public er.a<oq.i0> c() {
                        return this.onClick;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public Label getTitle() {
                        return this.title;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Add)) {
                            return false;
                        }
                        Add add = (Add) other;
                        return fr.t.c(this.title, add.title) && fr.t.c(this.description, add.description) && fr.t.c(this.onClick, add.onClick);
                    }

                    public int hashCode() {
                        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.onClick.hashCode();
                    }

                    public String toString() {
                        return "Add(title=" + this.title + ", description=" + this.description + ", onClick=" + this.onClick + ')';
                    }
                }

                /* JADX INFO: renamed from: y63.j$a$b$a$b, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Ly63/j$a$b$a$b;", "Ly63/j$a$b$a;", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lmx/a;", "()Lmx/a;", "e", "b", "f", "Ler/a;", "c", "()Ler/a;", "Ln50/k;", "a", "()Ln50/k;", "cardData", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Edit extends AbstractC6025a {

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label title;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label description;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                    private final er.a<oq.i0> onClick;

                    public Edit(Label label, Label label2, er.a<oq.i0> aVar) {
                        super(label, label2, aVar, null);
                        this.title = label;
                        this.description = label2;
                        this.onClick = aVar;
                    }

                    @Override // y63.j.a.Initialized.AbstractC6025a
                    public n50.k a() {
                        return new DefaultSingleCardData(null, c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(getTitle(), null, null, 0, 0, null, 62, null)), new SingleCardLabel(getDescription(), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public Label getDescription() {
                        return this.description;
                    }

                    public er.a<oq.i0> c() {
                        return this.onClick;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public Label getTitle() {
                        return this.title;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Edit)) {
                            return false;
                        }
                        Edit edit = (Edit) other;
                        return fr.t.c(this.title, edit.title) && fr.t.c(this.description, edit.description) && fr.t.c(this.onClick, edit.onClick);
                    }

                    public int hashCode() {
                        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.onClick.hashCode();
                    }

                    public String toString() {
                        return "Edit(title=" + this.title + ", description=" + this.description + ", onClick=" + this.onClick + ')';
                    }
                }

                /* JADX INFO: renamed from: y63.j$a$b$a$c, reason: from toString */
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Ly63/j$a$b$a$c;", "Ly63/j$a$b$a;", "Lmx/a;", "statusBadgeLabel", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lmx/a;", "e", "()Lmx/a;", "f", "b", "g", "Ler/a;", "c", "()Ler/a;", "Ln50/k;", "a", "()Ln50/k;", "cardData", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Pending extends AbstractC6025a {

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label statusBadgeLabel;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label title;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label description;

                    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                    private final er.a<oq.i0> onClick;

                    public Pending(Label label, Label label2, Label label3, er.a<oq.i0> aVar) {
                        super(label2, label3, aVar, null);
                        this.statusBadgeLabel = label;
                        this.title = label2;
                        this.description = label3;
                        this.onClick = aVar;
                    }

                    @Override // y63.j.a.Initialized.AbstractC6025a
                    public n50.k a() {
                        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(getTitle(), null, null, 0, 0, null, 62, null)), new SingleCardLabel(getDescription(), null, null, 0, 0, null, 62, null), 1, null);
                        return new DefaultSingleCardData(null, c(), false, null, null, false, null, new w0.StatusBadge(new r50.a.WithIcon(null, this.statusBadgeLabel, null, 0, false, r50.g.NOTICE, 29, null)), bodySection, null, x0.Icon.INSTANCE.b(), null, 2685, null);
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public Label getDescription() {
                        return this.description;
                    }

                    public er.a<oq.i0> c() {
                        return this.onClick;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public Label getTitle() {
                        return this.title;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Pending)) {
                            return false;
                        }
                        Pending pending = (Pending) other;
                        return fr.t.c(this.statusBadgeLabel, pending.statusBadgeLabel) && fr.t.c(this.title, pending.title) && fr.t.c(this.description, pending.description) && fr.t.c(this.onClick, pending.onClick);
                    }

                    public int hashCode() {
                        return (((((this.statusBadgeLabel.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.onClick.hashCode();
                    }

                    public String toString() {
                        return "Pending(statusBadgeLabel=" + this.statusBadgeLabel + ", title=" + this.title + ", description=" + this.description + ", onClick=" + this.onClick + ')';
                    }
                }

                public /* synthetic */ AbstractC6025a(Label label, Label label2, er.a aVar, fr.k kVar) {
                    this(label, label2, aVar);
                }

                public abstract n50.k a();

                private AbstractC6025a(Label label, Label label2, er.a<oq.i0> aVar) {
                    this.title = label;
                    this.description = label2;
                    this.onClick = aVar;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, List<? extends n50.k> list, er.a<oq.i0> aVar2) {
                this.scaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.cards = list;
                this.onSnackBarHidden = aVar2;
            }

            public final List<n50.k> a() {
                return this.cards;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            public final er.a<oq.i0> c() {
                return this.onSnackBarHidden;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.cards, initialized.cards) && fr.t.c(this.onSnackBarHidden, initialized.onSnackBarHidden);
            }

            public int hashCode() {
                return (((((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.cards.hashCode()) * 31) + this.onSnackBarHidden.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", cards=" + this.cards + ", onSnackBarHidden=" + this.onSnackBarHidden + ')';
            }
        }

        /* JADX INFO: renamed from: y63.j$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Ly63/j$a$c;", "Ly63/j$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lh30/a;", "buttonData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "Lh30/a;", "()Lh30/a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NoAccess implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f224806e = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            public NoAccess(BaseScaffoldData baseScaffoldData, Label label, Label label2, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.buttonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoAccess)) {
                    return false;
                }
                NoAccess noAccess = (NoAccess) other;
                return fr.t.c(this.scaffoldData, noAccess.scaffoldData) && fr.t.c(this.title, noAccess.title) && fr.t.c(this.description, noAccess.description) && fr.t.c(this.buttonData, noAccess.buttonData);
            }

            public int hashCode() {
                int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31;
                Label label = this.description;
                return ((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.buttonData.hashCode();
            }

            public String toString() {
                return "NoAccess(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", buttonData=" + this.buttonData + ')';
            }

            public /* synthetic */ NoAccess(BaseScaffoldData baseScaffoldData, Label label, Label label2, ButtonData buttonData, int i15, fr.k kVar) {
                this(baseScaffoldData, label, (i15 & 4) != 0 ? null : label2, buttonData);
            }
        }
    }
}
