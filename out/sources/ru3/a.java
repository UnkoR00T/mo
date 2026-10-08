package ru3;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lru3/a;", "Lzx/d;", "Lru3/a$a;", "Lru3/c;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends zx.d<AbstractC4497a, ContactDetailsFormData> {

    /* JADX INFO: renamed from: ru3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru3/a$a;", "", "<init>", "()V", "a", "b", "c", "Lru3/a$a$a;", "Lru3/a$a$b;", "Lru3/a$a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC4497a {

        /* JADX INFO: renamed from: ru3.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru3/a$a$a;", "Lru3/a$a;", "Lru3/b;", "contactDetailsData", "<init>", "(Lru3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru3/b;", "()Lru3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Back extends AbstractC4497a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContactDetailsData contactDetailsData;

            public Back(ContactDetailsData contactDetailsData) {
                super(null);
                this.contactDetailsData = contactDetailsData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ContactDetailsData getContactDetailsData() {
                return this.contactDetailsData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Back) && t.c(this.contactDetailsData, ((Back) other).contactDetailsData);
            }

            public int hashCode() {
                return this.contactDetailsData.hashCode();
            }

            public String toString() {
                return "Back(contactDetailsData=" + this.contactDetailsData + ")";
            }
        }

        /* JADX INFO: renamed from: ru3.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru3/a$a$b;", "Lru3/a$a;", "Lru3/b;", "contactDetailsData", "<init>", "(Lru3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru3/b;", "()Lru3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Close extends AbstractC4497a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContactDetailsData contactDetailsData;

            public Close(ContactDetailsData contactDetailsData) {
                super(null);
                this.contactDetailsData = contactDetailsData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ContactDetailsData getContactDetailsData() {
                return this.contactDetailsData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Close) && t.c(this.contactDetailsData, ((Close) other).contactDetailsData);
            }

            public int hashCode() {
                return this.contactDetailsData.hashCode();
            }

            public String toString() {
                return "Close(contactDetailsData=" + this.contactDetailsData + ")";
            }
        }

        /* JADX INFO: renamed from: ru3.a$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru3/a$a$c;", "Lru3/a$a;", "Lru3/b;", "contactDetailsData", "<init>", "(Lru3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru3/b;", "()Lru3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Next extends AbstractC4497a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContactDetailsData contactDetailsData;

            public Next(ContactDetailsData contactDetailsData) {
                super(null);
                this.contactDetailsData = contactDetailsData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ContactDetailsData getContactDetailsData() {
                return this.contactDetailsData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Next) && t.c(this.contactDetailsData, ((Next) other).contactDetailsData);
            }

            public int hashCode() {
                return this.contactDetailsData.hashCode();
            }

            public String toString() {
                return "Next(contactDetailsData=" + this.contactDetailsData + ")";
            }
        }

        public /* synthetic */ AbstractC4497a(k kVar) {
            this();
        }

        private AbstractC4497a() {
        }
    }
}
