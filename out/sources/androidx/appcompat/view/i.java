package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Window.Callback f8377a;

    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i15) {
            return callback.onWindowStartingActionMode(callback2, i15);
        }
    }

    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i15) {
            callback.onProvideKeyboardShortcuts(list, menu, i15);
        }
    }

    static class c {
        static void a(Window.Callback callback, boolean z15) {
            callback.onPointerCaptureChanged(z15);
        }
    }

    public i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f8377a = callback;
    }

    public final Window.Callback a() {
        return this.f8377a;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f8377a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f8377a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f8377a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f8377a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f8377a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f8377a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f8377a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f8377a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f8377a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i15, Menu menu) {
        return this.f8377a.onCreatePanelMenu(i15, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i15) {
        return this.f8377a.onCreatePanelView(i15);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f8377a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i15, MenuItem menuItem) {
        return this.f8377a.onMenuItemSelected(i15, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i15, Menu menu) {
        return this.f8377a.onMenuOpened(i15, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i15, Menu menu) {
        this.f8377a.onPanelClosed(i15, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z15) {
        c.a(this.f8377a, z15);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i15, View view, Menu menu) {
        return this.f8377a.onPreparePanel(i15, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i15) {
        b.a(this.f8377a, list, menu, i15);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f8377a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f8377a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z15) {
        this.f8377a.onWindowFocusChanged(z15);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i15) {
        return a.b(this.f8377a, callback, i15);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f8377a.onSearchRequested();
    }
}
