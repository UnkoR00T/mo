package c92;

import er.l;
import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lc92/a;", "", "<init>", "()V", "a", "c", "b", "Lc92/a$a;", "Lc92/a$c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: c92.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc92/a$a;", "Lc92/a;", "Lkotlin/Function1;", "Lc92/a$b;", "Loq/i0;", "onOptionSelected", "<init>", "(Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "()Ler/l;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChoosePhoto extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b, i0> onOptionSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public ChoosePhoto(l<? super b, i0> lVar) {
            super(null);
            this.onOptionSelected = lVar;
        }

        public final l<b, i0> a() {
            return this.onOptionSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChoosePhoto) && t.c(this.onOptionSelected, ((ChoosePhoto) other).onOptionSelected);
        }

        public int hashCode() {
            return this.onOptionSelected.hashCode();
        }

        public String toString() {
            return "ChoosePhoto(onOptionSelected=" + this.onOptionSelected + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc92/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        TAKE_PHOTO,
        PICK_PHOTO;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f24623d = wq.b.a(b());
    }

    /* JADX INFO: renamed from: c92.a$c, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc92/a$c;", "Lc92/a;", "Lkotlin/Function1;", "Lmx/a;", "Loq/i0;", "onItemSelected", "<init>", "(Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "()Ler/l;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Voivodeship extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Label, i0> onItemSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Voivodeship(l<? super Label, i0> lVar) {
            super(null);
            this.onItemSelected = lVar;
        }

        public final l<Label, i0> a() {
            return this.onItemSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Voivodeship) && t.c(this.onItemSelected, ((Voivodeship) other).onItemSelected);
        }

        public int hashCode() {
            return this.onItemSelected.hashCode();
        }

        public String toString() {
            return "Voivodeship(onItemSelected=" + this.onItemSelected + ')';
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
