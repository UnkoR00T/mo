package w50;

import android.text.TextUtils;
import fr.k;
import fu.r;
import lr.i;
import mx.Label;
import p071kotlin.Metadata;
import q4.e;
import v4.i0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lw50/a;", "Lv4/i0;", "", "Lv4/a0;", "keyboardType", "<init>", "(Ljava/lang/String;II)V", "Lq4/e;", "text", "", "k", "(Lq4/e;)Ljava/lang/String;", "o", "(Ljava/lang/String;)Ljava/lang/String;", "", "j", "(Ljava/lang/String;)Z", "Lmx/a;", "n", "()Lmx/a;", "a", "I", "getKeyboardType-PjHm6EE", "()I", "b", "c", "d", "e", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a implements i0 {
    BLIK { // from class: w50.a.a
        @Override // v4.i0
        public int b(int offset) {
            if (offset <= 3) {
                return offset;
            }
            if (offset <= 7) {
                return offset - 1;
            }
            return 6;
        }

        @Override // v4.i0
        public int e(int offset) {
            if (offset <= 2) {
                return offset;
            }
            if (offset <= 6) {
                return offset + 1;
            }
            return 7;
        }

        @Override // w50.a
        public boolean j(String text) {
            return TextUtils.isDigitsOnly(text) && text.length() <= 6;
        }

        @Override // w50.a
        public String k(e text) {
            String strO = o(text.getText());
            StringBuilder sb5 = new StringBuilder();
            int length = strO.length();
            for (int i15 = 0; i15 < length; i15++) {
                sb5.append(strO.charAt(i15));
                if (i15 == 2) {
                    sb5.append(" ");
                }
            }
            return sb5.toString();
        }

        @Override // w50.a
        public Label n() {
            return Label.INSTANCE.c();
        }

        @Override // w50.a
        public String o(String text) {
            return text.length() < 6 ? text : r.c1(text, new i(0, 5));
        }
    },
    POST_CODE { // from class: w50.a.d
        @Override // v4.i0
        public int b(int offset) {
            if (offset <= 2) {
                return offset;
            }
            if (offset <= 6) {
                return offset - 1;
            }
            return 5;
        }

        @Override // v4.i0
        public int e(int offset) {
            if (offset <= 1) {
                return offset;
            }
            if (offset <= 5) {
                return offset + 1;
            }
            return 6;
        }

        @Override // w50.a
        public boolean j(String text) {
            return TextUtils.isDigitsOnly(text) && text.length() <= 5;
        }

        @Override // w50.a
        public String k(e text) {
            return o(text.getText());
        }

        @Override // w50.a
        public Label n() {
            return mx.b.b("__-___", "placeholderValue");
        }

        @Override // w50.a
        public String o(String text) {
            if (text.length() >= 5) {
                text = r.c1(text, new i(0, 4));
            }
            StringBuilder sb5 = new StringBuilder();
            int length = text.length();
            for (int i15 = 0; i15 < length; i15++) {
                sb5.append(text.charAt(i15));
                if (i15 == 1) {
                    sb5.append("-");
                }
            }
            return sb5.toString();
        }
    },
    PHONE_COUNTRY_CODE { // from class: w50.a.c

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final int prefixOffset;

        @Override // v4.i0
        public int b(int offset) {
            int i15 = this.prefixOffset;
            if (offset < i15) {
                return 0;
            }
            return offset - i15;
        }

        @Override // v4.i0
        public int e(int offset) {
            return offset + this.prefixOffset;
        }

        @Override // w50.a
        public boolean j(String text) {
            return TextUtils.isDigitsOnly(text) && text.length() <= 9;
        }

        @Override // w50.a
        public String k(e text) {
            return o(text.getText());
        }

        @Override // w50.a
        public Label n() {
            return Label.INSTANCE.c();
        }

        @Override // w50.a
        public String o(String text) {
            return "+48 " + text;
        }
    },
    ID_APPLICATION_NUMBER { // from class: w50.a.b

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final String separator;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final int maxFormattedLength;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final int maxRawLength;

        @Override // v4.i0
        public int b(int offset) {
            if (offset <= 7) {
                return offset;
            }
            if (offset <= 11) {
                return offset - 1;
            }
            if (offset <= 15) {
                return offset - 2;
            }
            return offset <= 23 ? offset - 3 : this.maxRawLength;
        }

        @Override // v4.i0
        public int e(int offset) {
            if (offset <= 7) {
                return offset;
            }
            if (offset <= 11) {
                return offset + 1;
            }
            if (offset <= 18) {
                return offset + 2;
            }
            return offset <= 20 ? offset + 3 : this.maxFormattedLength;
        }

        @Override // w50.a
        public boolean j(String text) {
            return true;
        }

        @Override // w50.a
        public String k(e text) {
            return o(text.getText());
        }

        @Override // w50.a
        public Label n() {
            return Label.INSTANCE.c();
        }

        @Override // w50.a
        public String o(String text) {
            if (text.length() == 0) {
                return "";
            }
            StringBuilder sb5 = new StringBuilder();
            int length = text.length();
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                sb5.append(text.charAt(i16));
                i15++;
                if (i15 != 7) {
                    if (i15 != 11) {
                        if (i15 == 18 && i16 < r.k0(text) && text.length() > 18) {
                            sb5.append(this.separator);
                        }
                    } else if (i16 < r.k0(text) && text.length() > 11) {
                        sb5.append(this.separator);
                    }
                } else if (i16 < r.k0(text) && text.length() > 7) {
                    sb5.append(this.separator);
                }
            }
            return sb5.toString();
        }
    };


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f210283g = wq.b.a(g());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int keyboardType;

    /* synthetic */ a(int i15, k kVar) {
        this(i15);
    }

    public abstract boolean j(String text);

    public abstract String k(e text);

    public abstract Label n();

    public abstract String o(String text);

    a(int i15) {
        this.keyboardType = i15;
    }
}
