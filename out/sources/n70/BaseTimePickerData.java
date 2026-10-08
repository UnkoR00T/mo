package n70;

import er.l;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n70.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Ln70/a;", "", "Lmx/a;", "title", "", "initialHour", "initialMinute", "confirmButtonLabel", "cancelButtonLabel", "Lkotlin/Function1;", "Ln70/g;", "Loq/i0;", "onTimePicked", "Lkotlin/Function0;", "onClose", "<init>", "(Lmx/a;IILmx/a;Lmx/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "g", "()Lmx/a;", "b", "I", "c", "d", "e", "f", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaseTimePickerData {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f133374h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int initialHour;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int initialMinute;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label confirmButtonLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label cancelButtonLabel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<TimeResult, i0> onTimePicked;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClose;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseTimePickerData(Label label, int i15, int i16, Label label2, Label label3, l<? super TimeResult, i0> lVar, er.a<i0> aVar) {
        this.title = label;
        this.initialHour = i15;
        this.initialMinute = i16;
        this.confirmButtonLabel = label2;
        this.cancelButtonLabel = label3;
        this.onTimePicked = lVar;
        this.onClose = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getCancelButtonLabel() {
        return this.cancelButtonLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getConfirmButtonLabel() {
        return this.confirmButtonLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInitialHour() {
        return this.initialHour;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getInitialMinute() {
        return this.initialMinute;
    }

    public final er.a<i0> e() {
        return this.onClose;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseTimePickerData)) {
            return false;
        }
        BaseTimePickerData baseTimePickerData = (BaseTimePickerData) other;
        return t.c(this.title, baseTimePickerData.title) && this.initialHour == baseTimePickerData.initialHour && this.initialMinute == baseTimePickerData.initialMinute && t.c(this.confirmButtonLabel, baseTimePickerData.confirmButtonLabel) && t.c(this.cancelButtonLabel, baseTimePickerData.cancelButtonLabel) && t.c(this.onTimePicked, baseTimePickerData.onTimePicked) && t.c(this.onClose, baseTimePickerData.onClose);
    }

    public final l<TimeResult, i0> f() {
        return this.onTimePicked;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + Integer.hashCode(this.initialHour)) * 31) + Integer.hashCode(this.initialMinute)) * 31) + this.confirmButtonLabel.hashCode()) * 31) + this.cancelButtonLabel.hashCode()) * 31) + this.onTimePicked.hashCode()) * 31) + this.onClose.hashCode();
    }

    public String toString() {
        return "BaseTimePickerData(title=" + this.title + ", initialHour=" + this.initialHour + ", initialMinute=" + this.initialMinute + ", confirmButtonLabel=" + this.confirmButtonLabel + ", cancelButtonLabel=" + this.cancelButtonLabel + ", onTimePicked=" + this.onTimePicked + ", onClose=" + this.onClose + ')';
    }
}
