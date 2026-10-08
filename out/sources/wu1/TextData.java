package wu1;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wu1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwu1/b;", "", "Lmx/a;", "title", "content", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "<init>", "(Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "c", "Ler/a;", "d", "()Ler/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onCloseButtonClick;

    public TextData() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b() {
        return i0.f148189a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getContent() {
        return this.content;
    }

    public final er.a<i0> d() {
        return this.onCloseButtonClick;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) other;
        return t.c(this.title, textData.title) && t.c(this.content, textData.content) && t.c(this.onCloseButtonClick, textData.onCloseButtonClick);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.onCloseButtonClick.hashCode();
    }

    public String toString() {
        return "TextData(title=" + this.title + ", content=" + this.content + ", onCloseButtonClick=" + this.onCloseButtonClick + ')';
    }

    public TextData(Label label, Label label2, er.a<i0> aVar) {
        this.title = label;
        this.content = label2;
        this.onCloseButtonClick = aVar;
    }

    public /* synthetic */ TextData(Label label, Label label2, er.a aVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? Label.INSTANCE.c() : label, (i15 & 2) != 0 ? Label.INSTANCE.c() : label2, (i15 & 4) != 0 ? new er.a() { // from class: wu1.a
            @Override // er.a
            public final Object a() {
                return TextData.b();
            }
        } : aVar);
    }
}
