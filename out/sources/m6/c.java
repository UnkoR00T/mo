package m6;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import i6.i;
import io.sentry.android.core.c2;
import j6.l0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class c {

    class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f123820a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z15, b bVar) {
            super(inputConnection, z15);
            this.f123820a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i15, Bundle bundle) {
            if (this.f123820a.a(d.f(inputContentInfo), i15, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i15, bundle);
        }
    }

    public interface b {
        boolean a(d dVar, int i15, Bundle bundle);
    }

    public static /* synthetic */ boolean a(View view, d dVar, int i15, Bundle bundle) {
        if ((i15 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e15) {
                c2.h("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e15);
                return false;
            }
        }
        return l0.X(view, new j6.d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }

    private static b b(final View view) {
        i.g(view);
        return new b() { // from class: m6.b
            @Override // m6.c.b
            public final boolean a(d dVar, int i15, Bundle bundle) {
                return c.a(view, dVar, i15, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        i6.c.d(inputConnection, "inputConnection must be non-null");
        i6.c.d(editorInfo, "editorInfo must be non-null");
        i6.c.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }
}
