package b7;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import i6.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16973a;

    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f16974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f16975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f16976c = true;

        a(TextView textView) {
            this.f16974a = textView;
            this.f16975b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f16975b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f16975b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i15 = 0; i15 < inputFilterArr.length; i15++) {
                InputFilter inputFilter = inputFilterArr[i15];
                if (inputFilter instanceof d) {
                    sparseArray.put(i15, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayE = e(inputFilterArr);
            if (sparseArrayE.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayE.size()];
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                if (sparseArrayE.indexOfKey(i16) < 0) {
                    inputFilterArr2[i15] = inputFilterArr[i16];
                    i15++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f16974a.setFilters(a(this.f16974a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // b7.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f16976c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // b7.f.b
        void b(boolean z15) {
            if (z15) {
                j();
            }
        }

        @Override // b7.f.b
        void c(boolean z15) {
            this.f16976c = z15;
            j();
            i();
        }

        void g(boolean z15) {
            this.f16976c = z15;
        }

        void j() {
            this.f16974a.setTransformationMethod(l(this.f16974a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f16976c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        void b(boolean z15) {
            throw null;
        }

        void c(boolean z15) {
            throw null;
        }
    }

    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f16977a;

        c(TextView textView) {
            this.f16977a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.e.k();
        }

        @Override // b7.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f16977a.a(inputFilterArr);
        }

        @Override // b7.f.b
        void b(boolean z15) {
            if (d()) {
                return;
            }
            this.f16977a.b(z15);
        }

        @Override // b7.f.b
        void c(boolean z15) {
            if (d()) {
                this.f16977a.g(z15);
            } else {
                this.f16977a.c(z15);
            }
        }
    }

    public f(TextView textView, boolean z15) {
        i.h(textView, "textView cannot be null");
        if (z15) {
            this.f16973a = new a(textView);
        } else {
            this.f16973a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f16973a.a(inputFilterArr);
    }

    public void b(boolean z15) {
        this.f16973a.b(z15);
    }

    public void c(boolean z15) {
        this.f16973a.c(z15);
    }
}
