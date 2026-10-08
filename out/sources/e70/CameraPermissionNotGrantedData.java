package e70;

import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e70.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Le70/a;", "", "Lmx/a;", "title", "message", "buttonLabel", "Lkotlin/Function0;", "Loq/i0;", "buttonOnClick", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CameraPermissionNotGrantedData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47914e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label buttonLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> buttonOnClick;

    public CameraPermissionNotGrantedData(Label label, Label label2, Label label3, er.a<i0> aVar) {
        this.title = label;
        this.message = label2;
        this.buttonLabel = label3;
        this.buttonOnClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getButtonLabel() {
        return this.buttonLabel;
    }

    public final er.a<i0> b() {
        return this.buttonOnClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraPermissionNotGrantedData)) {
            return false;
        }
        CameraPermissionNotGrantedData cameraPermissionNotGrantedData = (CameraPermissionNotGrantedData) other;
        return t.c(this.title, cameraPermissionNotGrantedData.title) && t.c(this.message, cameraPermissionNotGrantedData.message) && t.c(this.buttonLabel, cameraPermissionNotGrantedData.buttonLabel) && t.c(this.buttonOnClick, cameraPermissionNotGrantedData.buttonOnClick);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.buttonLabel.hashCode()) * 31) + this.buttonOnClick.hashCode();
    }

    public String toString() {
        return "CameraPermissionNotGrantedData(title=" + this.title + ", message=" + this.message + ", buttonLabel=" + this.buttonLabel + ", buttonOnClick=" + this.buttonOnClick + ')';
    }
}
