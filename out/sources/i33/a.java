package i33;

import fr.t;
import p071kotlin.Metadata;
import u30.CheckBoxGroupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Li33/a;", "", "b", "a", "Li33/a$a;", "Li33/a$b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: i33.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li33/a$a;", "Li33/a;", "Lu30/a;", "checkBoxGroupData", "<init>", "(Lu30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu30/a;", "()Lu30/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckBoxes implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f88985b = CheckBoxGroupData.f194954g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckBoxGroupData checkBoxGroupData;

        public CheckBoxes(CheckBoxGroupData checkBoxGroupData) {
            this.checkBoxGroupData = checkBoxGroupData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CheckBoxGroupData getCheckBoxGroupData() {
            return this.checkBoxGroupData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckBoxes) && t.c(this.checkBoxGroupData, ((CheckBoxes) other).checkBoxGroupData);
        }

        public int hashCode() {
            return this.checkBoxGroupData.hashCode();
        }

        public String toString() {
            return "CheckBoxes(checkBoxGroupData=" + this.checkBoxGroupData + ')';
        }
    }

    /* JADX INFO: renamed from: i33.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li33/a$b;", "Li33/a;", "Li33/d;", "phoneAndEmailInputsCustomContentData", "<init>", "(Li33/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li33/d;", "()Li33/d;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneAndEmailOnly implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneAndEmailInputsCustomContentData phoneAndEmailInputsCustomContentData;

        public PhoneAndEmailOnly(PhoneAndEmailInputsCustomContentData phoneAndEmailInputsCustomContentData) {
            this.phoneAndEmailInputsCustomContentData = phoneAndEmailInputsCustomContentData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PhoneAndEmailInputsCustomContentData getPhoneAndEmailInputsCustomContentData() {
            return this.phoneAndEmailInputsCustomContentData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhoneAndEmailOnly) && t.c(this.phoneAndEmailInputsCustomContentData, ((PhoneAndEmailOnly) other).phoneAndEmailInputsCustomContentData);
        }

        public int hashCode() {
            return this.phoneAndEmailInputsCustomContentData.hashCode();
        }

        public String toString() {
            return "PhoneAndEmailOnly(phoneAndEmailInputsCustomContentData=" + this.phoneAndEmailInputsCustomContentData + ')';
        }
    }
}
