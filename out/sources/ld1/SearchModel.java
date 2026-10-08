package ld1;

import fr.t;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: ld1.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lld1/m;", "", "Lmx/a;", "titleLabel", "placeholderLabel", "", "Lld1/m$a;", "items", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label titleLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label placeholderLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> items;

    /* JADX INFO: renamed from: ld1.m$a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0016"}, d2 = {"Lld1/m$a;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "description", "", "isSelected", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;ZLer/a;)V", "a", "Lmx/a;", "b", "()Lmx/a;", "c", "Z", "d", "()Z", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final er.a<i0> onClick;

        public a(Label label, Label label2, boolean z15, er.a<i0> aVar) {
            this.label = label;
            this.description = label2;
            this.isSelected = z15;
            this.onClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public final er.a<i0> c() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }
    }

    public SearchModel() {
        this(null, null, null, 7, null);
    }

    public final List<a> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getPlaceholderLabel() {
        return this.placeholderLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitleLabel() {
        return this.titleLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchModel)) {
            return false;
        }
        SearchModel searchModel = (SearchModel) other;
        return t.c(this.titleLabel, searchModel.titleLabel) && t.c(this.placeholderLabel, searchModel.placeholderLabel) && t.c(this.items, searchModel.items);
    }

    public int hashCode() {
        return (((this.titleLabel.hashCode() * 31) + this.placeholderLabel.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "SearchModel(titleLabel=" + this.titleLabel + ", placeholderLabel=" + this.placeholderLabel + ", items=" + this.items + ')';
    }

    public SearchModel(Label label, Label label2, List<a> list) {
        this.titleLabel = label;
        this.placeholderLabel = label2;
        this.items = list;
    }

    public /* synthetic */ SearchModel(Label label, Label label2, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? Label.INSTANCE.c() : label, (i15 & 2) != 0 ? Label.INSTANCE.c() : label2, (i15 & 4) != 0 ? v.n() : list);
    }
}
