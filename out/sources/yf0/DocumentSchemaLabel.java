package yf0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yf0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lyf0/j;", "", "Lyf0/j$a;", "language", "", "value", "<init>", "(Lyf0/j$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyf0/j$a;", "()Lyf0/j$a;", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchemaLabel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: yf0.j$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\b¨\u0006\r"}, d2 = {"Lyf0/j$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        PL("pl"),
        EN("en"),
        UK("uk"),
        UNKNOWN("unknown");


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f226725g = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    public DocumentSchemaLabel(a aVar, String str) {
        this.language = aVar;
        this.value = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchemaLabel)) {
            return false;
        }
        DocumentSchemaLabel documentSchemaLabel = (DocumentSchemaLabel) other;
        return this.language == documentSchemaLabel.language && t.c(this.value, documentSchemaLabel.value);
    }

    public int hashCode() {
        return (this.language.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "DocumentSchemaLabel(language=" + this.language + ", value=" + this.value + ")";
    }
}
