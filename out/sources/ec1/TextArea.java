package ec1;

import p071kotlin.Metadata;
import t50.TextAreaData;

/* JADX INFO: renamed from: ec1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lec1/f;", "", "Lec1/d0;", "type", "Lt50/d;", "inputData", "<init>", "(Lec1/d0;Lt50/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lec1/d0;", "b", "()Lec1/d0;", "Lt50/d;", "()Lt50/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextArea {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f49355c = TextAreaData.f187694o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextAreaData inputData;

    public TextArea(d0 d0Var, TextAreaData textAreaData) {
        this.type = d0Var;
        this.inputData = textAreaData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextAreaData getInputData() {
        return this.inputData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d0 getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextArea)) {
            return false;
        }
        TextArea textArea = (TextArea) other;
        return this.type == textArea.type && fr.t.c(this.inputData, textArea.inputData);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.inputData.hashCode();
    }

    public String toString() {
        return "TextArea(type=" + this.type + ", inputData=" + this.inputData + ')';
    }
}
