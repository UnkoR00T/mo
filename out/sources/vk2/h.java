package vk2;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvk2/h;", "", "a", "Lvk2/h$a;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: vk2.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvk2/h$a;", "Lvk2/h;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "onDismissDialog", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refresh implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDismissDialog;

        public Refresh(er.a<i0> aVar, er.a<i0> aVar2) {
            this.onClick = aVar;
            this.onDismissDialog = aVar2;
        }

        public final er.a<i0> a() {
            return this.onClick;
        }

        public final er.a<i0> b() {
            return this.onDismissDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Refresh)) {
                return false;
            }
            Refresh refresh = (Refresh) other;
            return t.c(this.onClick, refresh.onClick) && t.c(this.onDismissDialog, refresh.onDismissDialog);
        }

        public int hashCode() {
            return (this.onClick.hashCode() * 31) + this.onDismissDialog.hashCode();
        }

        public String toString() {
            return "Refresh(onClick=" + this.onClick + ", onDismissDialog=" + this.onDismissDialog + ')';
        }
    }
}
